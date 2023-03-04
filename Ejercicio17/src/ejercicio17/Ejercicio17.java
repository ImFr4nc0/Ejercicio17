/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;
import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        double radio, area, perimetro;
        System.out.println("Ingrese el radio del circulo: ");
        Scanner entrada = new Scanner(System.in);
        radio = entrada.nextDouble();
        area = Math.PI*Math.pow(radio, 2);
        perimetro = Math.PI*radio*2;
        
        System.out.println("El area del circulo es: " + area);
        System.out.println("La longitud de la circunferencia es: " + perimetro);
    }
    
}
