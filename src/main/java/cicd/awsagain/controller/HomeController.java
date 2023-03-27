package cicd.awsagain.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String getDemo(){
        return "hello pawan banna ji !!!";
    }
}
