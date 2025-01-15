/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author ajlon
 */
public class Circulo {
    
    double Radio;
    
    // Constructor de clase
    Circulo(double Radio){
        this.Radio = Radio;
    }
    
    double calculaArea(){
        return Math.PI*Math.pow(Radio,2);
    }
    
    double calcularPerimetro(){
        return 2*Math.PI*Radio;
    }
    
    static String limpiarCampo(){
        return "";
    }
}
