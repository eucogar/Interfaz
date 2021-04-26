/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author eucog
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Coloreable cuadrado = new Cuadrado();
        Coloreable tri = new Triangulo();
        Coloreable cir = new Circulo();
        
        System.out.println("Cuadrado: (color actual: "+cuadrado.color("Rojo")+" Cambio de color: "+cuadrado.Cambiacolor("Verde)"));
        System.out.println("Triangulo: (Color actual:"+tri.color("Negro")+" Cambio de color: "+tri.Cambiacolor("Azul)"));
        System.out.println("Circulo : (Color actual: "+cir.color("Rosa")+" Cambio de color: "+cir.Cambiacolor("Lila)"));
    }
    
}
