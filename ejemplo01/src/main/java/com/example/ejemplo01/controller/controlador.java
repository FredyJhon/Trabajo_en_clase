package com.example.ejemplo01.controller;

import com.example.ejemplo01.entidad.persona;
import com.example.ejemplo01.servicio.serviciopersona;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class controlador {


    private serviciopersona servicio;
    ;

    public controlador(serviciopersona servicio){
        this.servicio=servicio;
    }


    @GetMapping("/listapersona")
    public List<persona> listapersona(){
    return  servicio.listarpersona();
    }


    @GetMapping("/buscarpersona/{nombre}")
    public persona buscarpersona(@PathVariable String nombre){
        return servicio.buscarpersona(nombre);
    }

    @PostMapping("/insertarpersona")
    public void insertarpersona(@RequestBody persona Persona){
        servicio.agregarpersona(Persona);
    }
    
}
