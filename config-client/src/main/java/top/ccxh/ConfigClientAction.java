package top.ccxh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class ConfigClientAction {
    @GetMapping("/")
    public String index(){
        return "读取配置服务器";
    }
        public static void main(String[] args) {
            SpringApplication.run(ConfigClientAction.class, args);
        }
}
