package guru.springframework.sfgdi.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello(){
        System.out.println("Hellow world");
        return "Hi Folks";
    }
}
