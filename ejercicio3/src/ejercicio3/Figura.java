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
public class Figura implements Coloreable{
    
    String color;

    public Figura() {
    }

    public Figura(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void Dibujar(String color)
    {
        
    }
    public void Borrar(String color)
    {
        
    }

    @Override
    public String Cambiacolor(String c) {
      return c;
    }

    @Override
    public String color(String c) {
       return c;
    }

    
       

}
