package top.ccxh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class EurekaServerAction {
        public static void main(String[] args) {
            SpringApplication.run(EurekaServerAction.class, args);
        }
}
