package top.ccxh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@SpringBootApplication
@EnableConfigServer
public class ConfigServiceAction {
        public static void main(String[] args) {
            SpringApplication.run(ConfigServiceAction.class, args);
        }
}
