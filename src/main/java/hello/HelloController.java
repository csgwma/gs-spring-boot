package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @RestController combines @Controller and @ResponseBody, two annotations that results in web requests returning data
 * rather than a view.
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/acema")
    public String acema() {
        return "Welcome to Ace.Ma's Homepage!!!";
    }

}
