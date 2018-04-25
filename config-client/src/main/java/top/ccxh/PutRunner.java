package top.ccxh;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class PutRunner implements ApplicationRunner {
    @Value("${test}")
    private String test;
    @Value("${test1}")
    private String test1;
    @Value(value = "${test2}")
    private String test2;

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        System.out.printf("加载的文件:{%s}\n",test);

    }
}
