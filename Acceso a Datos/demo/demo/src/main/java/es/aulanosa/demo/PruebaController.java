package es.aulanosa.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pruebas")
public class PruebaController {

    @GetMapping("/saludo")
    public ResponseEntity<String> saludar() {
        return new ResponseEntity<>("Hola", HttpStatus.OK);
    }
}
