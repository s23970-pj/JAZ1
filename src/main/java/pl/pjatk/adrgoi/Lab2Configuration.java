package pl.pjatk.adrgoi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class Lab2Configuration {
    @Bean
    public Lab2Class returnLab2Class(){
        return new Lab2Class("Adrian", "Goik");
    }

    @Bean
    public List<String>defaultData(){
        return List.of("Raz", "Dwa", "Trzy", "Cztery", "Pięć");
    }
}
