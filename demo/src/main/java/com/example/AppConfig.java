package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.model.Batman;
import com.example.model.Batmobile;
import com.example.model.Hook;
import com.example.model.Mask;
import com.example.model.Suit;

@Configuration
public class AppConfig {
    @Bean(name = "batman");
    public Batman getBatman(){
        return new Batman(getSuit(), getBatmobile());
    }

    @Bean(name = "batmobile");
    public Batmobile getBatmobile(){
        return new Batmobile("nero");
    }
    
    @Bean(name = "mask");
    public Mask getMask(){
        return new Mask("nero");
    }

    @Bean(name = "hook");
    public Hook getHook(){
        return new Hook();
    }

    @Bean(name = "suit");
    public Suit getSuit(){
        return new Suit("nero", getMask(), getHook());
    }
}
