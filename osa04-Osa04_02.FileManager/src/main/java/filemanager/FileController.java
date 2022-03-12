/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filemanager;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author samie
 */
@Controller
public class FileController {
    
    @Autowired
    private FileRepository fileRepository;
    
    @GetMapping("/files")
    public String getFiles(Model model) {
        model.addAttribute("files", fileRepository.findAll());
        
        return "files";
    }
    
    @PostMapping("/files")
    public String save(@RequestParam("file") MultipartFile file) throws IOException {
        FileObject newFile = new FileObject();
        newFile.setName(file.getOriginalFilename());
        newFile.setContentType(file.getContentType());
        newFile.setContentLength(file.getSize());
        newFile.setContent(file.getBytes());
        
        fileRepository.save(newFile);
        
        return "redirect:/files";
    }
    
    @GetMapping("/files/{id}")
    public ResponseEntity<byte[]> viewFile(@PathVariable Long id) {
        FileObject file = fileRepository.getOne(id);
        
        final HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.parseMediaType(file.getContentType()));
        headers.setContentLength(file.getContentLength());
        headers.add("Content-Disposition", "attachment; filename=" + file.getName());
        
        return new ResponseEntity<>(file.getContent(), headers, HttpStatus.CREATED);
    }
    
    @DeleteMapping("/files/{id}")
    public String delete(@PathVariable Long id) {
        fileRepository.deleteById(id);
        
        return "redirect:/files";
    }
}
