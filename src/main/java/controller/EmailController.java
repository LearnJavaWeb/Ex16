package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
public class EmailController {

    private static Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public EmailController(){
        pattern = Pattern.compile(EMAIL);
    }

    @GetMapping("/home")
    String getHome(){
        return "home";
    }



    @PostMapping("/validate")
    String validateEmail(@RequestParam("email") String email, Model model){
        boolean isvaild = this.validate(email);

        if (!isvaild){
            model.addAttribute("message","Email khong hop le");
            return "home";
        }
        model.addAttribute("email",email);
        return "success";

    }
    private boolean validate(String check){
        matcher = pattern.matcher(check);
        return matcher.matches();
    }
}
