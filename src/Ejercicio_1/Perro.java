/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_1;

/**
 *
 * @author Jorgito
 */
public class Perro extends Animal{

    public Perro() {
        super();
    }

    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }    
    
    @Override
    public void alimentarse(){
        System.out.println("Perro: " + nombre + " se alimenta de: " + alimento );
    }

    
}
