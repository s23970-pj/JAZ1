package pl.pjatk.adrgoi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NewConfig {
    @Bean
    public NewClass newClass(){
        return new NewClass();
    }

}
