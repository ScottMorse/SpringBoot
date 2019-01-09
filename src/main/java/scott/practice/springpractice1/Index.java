package scott.practice.springpractice1;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Index {

    @RequestMapping("/")
    public String index() {
        return "What hath God sprung upon me?";
    }

}