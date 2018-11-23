package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonController {
    @RequestMapping("/test/{username}")
    public String showUserName(@PathVariable("username") String username, Model model) {
        return "profile";
    }
    @RequestMapping("/test2/{username}")
    public String showUser(@PathVariable("username") String username, Model model) {
        if(model.containsAttribute("user")){
            System.out.println("包含User");
        }
        return "profile2";
    }
}
