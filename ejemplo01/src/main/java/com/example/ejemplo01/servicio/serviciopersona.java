package com.example.ejemplo01.servicio;

import com.example.ejemplo01.entidad.persona;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class serviciopersona {


    public List<persona> personas= new ArrayList<>();

    public serviciopersona() {
        personas.add(new persona("john",18,"john@hotmail.com"));
        personas.add(new persona("andrea",20,"correo5@hotmail.com"));
        personas.add(new persona("juan",22,"correo452@hotmail.com"));
        personas.add(new persona("camilo",25,"correo42333@hotmail.com"));
        personas.add(new persona("maria",20,"maria@hotmail.com"));

    }

    public List<persona> listarpersona(){
        return personas;
    }

    public persona buscarpersona(String nombre){
        for (persona persona: personas){
            if (persona.getNombre().equals(nombre)) {
                return persona;
                }
            }
        return null;
    }

    public void agregarpersona(persona nuevapersona){
        personas.add(nuevapersona);
    }

}

