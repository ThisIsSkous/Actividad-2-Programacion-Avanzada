/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.utpl.tarea;

/**
 *
 * @author Skous
 */
public class Tarea {
class Universidad {
    String nombre;
    String ubicacion;

    public Universidad(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }
}

class Carrera {
    String nombre;
    Universidad universidad;

    public Carrera(String nombre, Universidad universidad) {
        this.nombre = nombre;
        this.universidad = universidad;
    }
}

// Ejemplo de uso
Universidad miUniversidad = new Universidad("UTPL", "Loja");
Carrera miCarrera = new Carrera("Transformacion Digital De Empresas", miUniversidad);

    public static void main(String[] args) {
    }
}
