package hellomodel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloModelController {

    @GetMapping("/")
    public String hellomodel(Model model,
            @RequestParam String title,
            @RequestParam String person) {
        model.addAttribute("person", person);
        model.addAttribute("title", title);
        return "index";
    }
}
