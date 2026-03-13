package com.cozy.QuizSystem.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.sql.DataSource;



@RestController
public class HealthController {
    private final DataSource dataSource;
    public HealthController (DataSource dataSource){
        this.dataSource = dataSource;
    }
    @GetMapping("/health")
    public String checkDb(){
        try {
            dataSource.getConnection();
            return "DB connected";
        } catch (Exception e) {
            return "Db error " + e.getMessage();
        }
    }
}

