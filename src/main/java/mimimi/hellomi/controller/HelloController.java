package mimimi.hellomi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    public String index() {
        return "index";
    }

}
