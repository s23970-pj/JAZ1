package pl.pjatk.adrgoi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
@Component
public class printOwnValue {   //trzeba dodać Component żeby spring wiedział że to jego część
 public printOwnValue(@Value("${my.own.value}") String valueFromProperties){
     System.out.println(valueFromProperties);
 }
}
