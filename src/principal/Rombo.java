/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author ajlon
 */
public class Rombo{
    double Lado, diagonalMayor, diagonalMenor;
    
    Rombo(double Lado, double diagonalMayor,double diagonalMenor){
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        this.Lado = Lado;
    }
    
    double calcularArea(){
        return diagonalMayor*diagonalMenor/2;
    }
    
    double calcularPerimetro(){
        return 4*Lado;
    }
    static String limpiarCampo(){
        return "";
    }
}
