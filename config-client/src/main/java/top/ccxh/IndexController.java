package top.ccxh;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Value("${test}")
    private String test;

    @GetMapping("/")
    public String index(){
        return test;
    }
}
