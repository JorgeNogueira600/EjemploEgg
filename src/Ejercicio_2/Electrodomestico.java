/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2;

/**
 *
 * @author Jorgito
 */
public class Electrodomestico {
    protected int precio;
    protected String color;
    protected char consumo_energetico;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(int precio, String color, char consumo_energetico, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumo_energetico = consumo_energetico;
        this.peso = peso;
    }
    
    public String comprobarConsumoEnergetico(){
        String consumo = " ";
        if (consumo.toLowerCase() != "a" || consumo != "b" || consumo != "c" || consumo != "d"||
                consumo != "e") {
            
        }consumo = "f";       
        
        return consumo;
    }
    
    public String comprobarColor(){
        String color = "";
        color.toLowerCase();
        if (color != "negro" || color != "rojo" || color != "azul" || color != "gris") {
            color = "blanco";
        }
        
        return color;
    }
    
    public void crearElectodomestico(){
        
        
    }
}
