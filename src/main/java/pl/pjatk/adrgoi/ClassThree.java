package pl.pjatk.adrgoi;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ClassThree { //problem ClassOne mialem zamiast classOne nie mogl znalezc beana
public ClassThree(ApplicationContext context){
    var a = context.getBean("classOne", ClassOne.class); //w adnotacji mozna zmienic
    var b = context.getBean("classTwo", ClassTwo.class);
}
}
