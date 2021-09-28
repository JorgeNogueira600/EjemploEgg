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
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal perro = new Perro("Stich", "Carne", 2, "Callejero");
        
        perro.alimentarse();
        
        Animal gato = new Gato("Michi", "croquetas",5, "Persa");
        
        gato.alimentarse();
        
        Animal caballo = new Caballo("Ico", "alfalfa", 6, "Bayo");
        
        caballo.alimentarse();
        
    }
    
}
