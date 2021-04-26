/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication41;

/**
 *
 * @author eucog
 */
public class Calsueldo implements Sueldo
{

    @Override
    public int Sdocente(int s, int Hd) {
        return ((s*Hd)*70)/100+(s*Hd);
    }
        

    @Override
    public int Sempleado(int s, int He) {
      return (s*He)*2;
    }
    
}
