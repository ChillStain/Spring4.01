package Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@ GetMapping ("/HolaMundo")
    public  String  saluda(@ RequestParam(value = "nombre", required = false, defaultValue = "UNKNOWKN") String  nombre){
        return  "Hola " + nombre + ". Estás ejecutando un proyecto Maven.";
    }

    @ GetMapping ({ "/HolaMundo2" , "/HolaMundo2/{nombre}" })
    public  String  saluda2(@ PathVariable(required = false) String  nombre){
        return  "Hola " + nombre + ". Estás ejecutando un proyecto Maven.";
    }
}
