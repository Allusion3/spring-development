package com.springdevelopment.springboot.myfirstwebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {

    private Logger log = LoggerFactory.getLogger(getClass());
    @Autowired
    private AuthenticationService authenticationService;

    // get the login page
    @RequestMapping(value="login", method= RequestMethod.GET)
    public String gotoLoginPage() {
        return "login";
    }

    // send to the welcome page
    @RequestMapping(value="login", method= RequestMethod.POST)
    public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {


        // Authentication
        // name - Jean
        // password - jean1234
        if(authenticationService.authenticate(name, password)){
            model.put("name", name);
            return "welcome";
        }
        model.put("errorMessage", "Invalid Credentials, please try again");
        return "login";
    }
}
