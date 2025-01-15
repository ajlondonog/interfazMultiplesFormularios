/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author ajlon
 */
public class Rectangulo {
    
    double base, altura;
    
    Rectangulo(double base, double altura){
        this.altura = altura;
        this.base = base;
    }
    
    double calcularArea(){
        return base*altura;
    }
    
    double calcularPerimetro(){
        return 2*base + 2*altura;
    }
    
    static String limpiarCampo(){
        return "";
    }
}
