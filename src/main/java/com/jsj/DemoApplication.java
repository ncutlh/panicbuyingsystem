package com.jsj;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
//将项目中对应的mapper类的路径加进来就可以了
@MapperScan("com.jsj.dao")
/**
 * @author jiangshenjie
 * @date 2018-9-21
 */
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RequestMapping("/")
    String index() {
        return "Panic Buy System";
    }
}
