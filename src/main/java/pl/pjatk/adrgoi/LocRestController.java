package pl.pjatk.adrgoi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class LocRestController {

    @GetMapping("/hello2")
    public ResponseEntity<String> hello2(){
        String message = "Hello World";
        return ResponseEntity.ok(message);
    }

    @GetMapping("/car")  //Cw2
    public ResponseEntity<RandomModel> getCar(){
        RandomModel randomModel = new RandomModel("Volskwagen","Golf7",2013);
        return ResponseEntity.ok(randomModel);
    }

    @GetMapping("/hello")
    public ResponseEntity<String> hello(@RequestParam("reqParam") String value){ //Cw3
        return ResponseEntity.ok(value);
    }
}
