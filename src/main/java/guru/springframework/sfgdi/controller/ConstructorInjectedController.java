package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    // using Contructor Injection is best to way to inject bean

    private final GreetingService greetingService;

    // For Constructor it is Optional to put @Autowired annotation on Constructor. Because Spring will autmatically inject bean
    public ConstructorInjectedController(@Qualifier("constructorGreetingServiceImpl") GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
