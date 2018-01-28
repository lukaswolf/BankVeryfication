package pl.lukaszwilk.BankVeryfication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @PostMapping("/")
    public String index(@RequestParam("login") String login,
                        @RequestParam("password") String password,
                        @RequestParam("nickName") String nickName,
                        Model model){
        if (login.equals("oskar") && password.equals("admin") && !nickName.isEmpty()){
            model.addAttribute("nickName",nickName);
            return "redirect:/dashboard";
        }
        model.addAttribute("error"," nie poprawne dane");
        return "login";
    }

    @GetMapping("/")
    public String index (){
        return "login";
    }
}
