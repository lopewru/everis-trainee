package com.example.springcoredojo.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevDatasourceConfig {

    public String getName(){
        return "DevDatasourceConfig";
    }

}
