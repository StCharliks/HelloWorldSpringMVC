package by.ostapenko.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import java.util.Date;

/**
 * Created by Ostapenko
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String home(Model model){
        model.addAttribute("time", (new Date()).toString());
        return "test";
    }
}
