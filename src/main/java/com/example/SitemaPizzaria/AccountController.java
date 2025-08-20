package com.example.SitemaPizzaria;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://a1.html:1", maxAge = 3600)
@RestController
@RequestMapping("/Pizzaria")
public class AccountController {

    @GetMapping("/{id}")
    public void retrieve(@PathVariable Long id) {
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable Long id) {
        // ...
    }
}
