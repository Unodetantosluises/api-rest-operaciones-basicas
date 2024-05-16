package com.example.firstapirest.controller;

import com.example.firstapirest.FirstApiRestApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hola")
    public String saludar() {
        return "Hola a todos, esta API realiza operaciones matematicas";
    }

    @GetMapping("/suma")
    public String suma(@RequestParam(value = "a") float a, @RequestParam(value = "b") float b) {
        float resultadoSuma = FirstApiRestApplication.suma(a, b);
        return "El resultado de la suma es " + resultadoSuma;
    }

    @GetMapping("/resta")
    public String resta(@RequestParam(value = "a") int a, @RequestParam(value = "b") int b) {
        int resultadoResta = FirstApiRestApplication.resta(a, b);
        return "El resultado de la resta es " + resultadoResta;
    }

    @GetMapping("/multiplicacion")
    public String multiplicacion(@RequestParam(value = "a") int a, @RequestParam(value = "b") int b) {
        int resultadoMultiplicacion = FirstApiRestApplication.multiplicacion(a,b);
        return "El resultado de la multiplicacion es " + resultadoMultiplicacion;
    }

    @GetMapping("/division")
    public String division(@RequestParam(value = "a") int a, @RequestParam(value = "b") int b) {
        int resultadoDivision = FirstApiRestApplication.division(a, b);
        return "El resltado de la division es " + resultadoDivision;
    }

    @GetMapping("/mayorque")
    public String mayorque(@RequestParam(value = "a")int a, @RequestParam(value = "b") int b) {
        String resultadoMayor = FirstApiRestApplication.calculaMayor(a, b);
        return resultadoMayor;
    }
}
