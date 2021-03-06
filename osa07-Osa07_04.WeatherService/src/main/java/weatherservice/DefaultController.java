package weatherservice;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("*")
public class DefaultController {

    @RequestMapping(method = RequestMethod.GET)
    public String getDefaultPage() {
        return "redirect:/locations";
    }
    
    @GetMapping("/flushcaches")
    @CacheEvict(cacheNames = {"locations"}, allEntries = true)
    @ResponseBody
    public String flushCaches() {
        return "OK";
    }
    
}
