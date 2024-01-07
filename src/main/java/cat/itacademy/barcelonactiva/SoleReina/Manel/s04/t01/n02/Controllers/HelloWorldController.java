package cat.itacademy.barcelonactiva.SoleReina.Manel.s04.t01.n02.Controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
    @GetMapping("/HelloWorld")
    @ResponseBody
    public static String saluda(@RequestParam(required = false, defaultValue = "UNKNOWN") String nom) {
        return "Hola, " + nom + ". Estàs executant un projecte Gradle.";
    }
    @RequestMapping(value = {"HelloWorld2", "/HelloWorld2/{nom}"})
    public static String saluda2(@PathVariable(required = false) String nom) {
        if (nom == null) {
            nom = "UNKNOWN";
        }
        return "Hola, " + nom + ". Estàs executant un projecte Gradle.";
    }
}
