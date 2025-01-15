/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author ajlon
 */
public class Trapecio {
    double Lado1, Lado2, baseMayor, baseMenor, Altura;
    
    Trapecio(double Lado1, double Lado2, double baseMayor, double Altura, double baseMenor){
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.Altura = Altura;
        this.Lado1 = Lado1;
        this.Lado2 = Lado2;
    }
    
    double calcularArea(){
        return (baseMayor + baseMenor)*Altura/2;
    }
    
    double calcularPerimetro(){
        return baseMayor + baseMenor + Lado1 + Lado2;
    }
    static String limpiarCampo(){
        return "";
    }
}