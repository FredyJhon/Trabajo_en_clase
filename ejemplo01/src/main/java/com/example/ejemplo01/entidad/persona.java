package com.example.ejemplo01.entidad;

public class persona {

    public String nombre;
    public int edad;

    public String correo;


    public persona(String nombre, int edad, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }


    @Override
    public String toString() {
        return "\n persona{" +
                "\n nombre = " + nombre +
                "\n edad = " + edad +
                "\n correo = " + correo +
                "\n\n";
    }
}
