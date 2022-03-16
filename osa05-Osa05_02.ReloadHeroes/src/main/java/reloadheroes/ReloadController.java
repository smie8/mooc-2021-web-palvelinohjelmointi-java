package reloadheroes;

import java.util.UUID;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReloadController {

    @Autowired
    private ReloadStatusRepository reloadStatusRepository;

    @Autowired
    private HttpSession session;

    @RequestMapping("*")
    public String reload(Model model, HttpSession session) {
        ReloadStatus reloadStatus;
        
        if (session.getAttribute("name") != null) {
            String name = (String) session.getAttribute("name");
            reloadStatus = reloadStatusRepository.findByName(name);
        } else {
            String generatedName = "user_" + UUID.randomUUID().toString().substring(0, 5);
            reloadStatus = new ReloadStatus(generatedName, 0);
        }
        
        session.setAttribute("name", reloadStatus.getName());
        
        reloadStatus.setReloads(reloadStatus.getReloads() + 1);
        
        reloadStatusRepository.save(reloadStatus);
        model.addAttribute("status", reloadStatus);
        
        Pageable pageable = PageRequest.of(0, 5, Sort.by("reloads").descending());
        model.addAttribute("scores", reloadStatusRepository.findAll(pageable));
        
        return "index";
    }
}
