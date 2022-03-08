package todoapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoApplicationController {

    @Autowired
    private TodoRepository todoRepository;
    
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("items", todoRepository.findAll());
        return "index";
    }
    
    @PostMapping("/")
    public String post(@RequestParam String name) {
        todoRepository.save(new Item(name));
        return "redirect:/";
    }
    
    @GetMapping("/{id}")
    public String getOne(Model model, @PathVariable long id) {
        Item item = todoRepository.getOne(id);
        item.setChecked(item.getChecked() + 1);
        model.addAttribute("item", todoRepository.getOne(id));
        todoRepository.save(item);
        return "todo";
    }
}
