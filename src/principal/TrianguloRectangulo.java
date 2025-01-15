/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author ajlon
 */
public class TrianguloRectangulo {
    double base,altura;
    
    TrianguloRectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    double calcularArea(){
        return base*altura/2;
    }
    
    double calcularPerimetro(){
        return base + altura + calcularHipotenusa();
    }
    
    double calcularHipotenusa(){
        return Math.sqrt(Math.pow(base,2) + Math.pow(altura,2));
    }
    
    static String limpiarCampo(){
    return "";
    }
    
    String determinarTipoTriangulo(){
        
        if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa())){
            return "equilátero";
        }
        
        else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa())){
            return "escaleno";
        }
        
        else{
            return "isósceles";
        }
    }
}
