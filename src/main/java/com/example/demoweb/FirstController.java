package com.example.demoweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class FirstController {
    @GetMapping("/")
    public String zapusk () {
        return "Приложение запущенно";
    }
    @GetMapping("/info")
    public String info () {
        return "Имя- Суворов Антон,\n" +
                "pojectX,\n" +
                "04/02/2023,\n" +
                "честно говоря я не знаю, что за проект будет.";
    }

}


