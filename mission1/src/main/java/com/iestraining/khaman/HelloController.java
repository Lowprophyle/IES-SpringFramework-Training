package com.iestraining.khaman;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller // This is used to specify the controller.
@EnableAutoConfiguration  //  This enables auto configuration for the Application Context.
public class HelloController {
    @RequestMapping("/hello-hello")  // This is used to map to the Spring MVC controller method.
    // URI path is /hello-hello

    @ResponseBody  // Used to bind the HTTP response body with a domain object in the return type.
    // This annotation works behind the scenes.
    public String sayHello() {
        return "Hello World! Khaman was here!";
    }
}