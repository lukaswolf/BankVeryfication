package pl.lukaszwilk.BankVeryfication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DashboardController {
    @GetMapping("/dashboard")
    public String dashboard(Model model){
        model.addAttribute("formRequest",new RequestForm());
        return "dashboard";

    }
    @PostMapping("/dashboard")
    public String dashboard(@ModelAttribute("formRequest") RequestForm requestForm, Model model){

        model.addAttribute("infoCredit",hasCredit(requestForm));
        return "dashboard";
    }
    private boolean hasCredit(RequestForm form){
        return (form.getMonthCash() - form.getMinusCash())*0.7> form.getCreditCash()/form.getCreditTime();

    }
}
