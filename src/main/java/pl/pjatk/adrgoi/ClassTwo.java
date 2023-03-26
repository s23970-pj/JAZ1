package pl.pjatk.adrgoi;

import org.springframework.stereotype.Component;

@Component
public class ClassTwo {
    public ClassTwo(ClassOne classOne){
        System.out.println("Hello from 2");
        classOne.printHello();
    }


}
