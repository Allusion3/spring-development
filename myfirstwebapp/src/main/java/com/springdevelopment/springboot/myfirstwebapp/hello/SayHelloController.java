package com.springdevelopment.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

//    http://localhost:8080/say-hello
    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello(){
        return "Hello! What are you learning today?";
    }

    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml(){
        StringBuffer sb = new StringBuffer();

        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>My First HTML Page</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("My First html page with body - changed");
        sb.append(" </body>");
        sb.append("</html>");
    return sb.toString();
    }


}
