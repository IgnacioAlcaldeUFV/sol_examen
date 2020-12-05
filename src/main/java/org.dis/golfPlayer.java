//Clase para crear el objeto plano (POJO) con anotaciones
package org.dis;

import com.opencsv.bean.CsvBindByName;

public class golfPlayer{

    @CsvBindByName
    private String Posicion;
    @CsvBindByName
    private String Nombre;
    @CsvBindByName
    private String Apellido;
    @CsvBindByName
    private String Pais;
    @CsvBindByName
    private String Edad;

    public golfPlayer() {
    }

    public golfPlayer(String posicion, String nombre, String apellido, String pais, String edad) {
        Posicion = posicion;
        Nombre = nombre;
        Apellido = apellido;
        Pais = pais;
        Edad = edad;
    }

    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String posicion) {
        Posicion = posicion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String edad) {
        Edad = edad;
    }
}