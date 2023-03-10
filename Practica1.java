package EjerciciosLogica;


import java.text.DecimalFormat;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author artur
 */
public class Practica1 {
    public static void main(String[] args) {
        
        DecimalFormat format = new DecimalFormat("#.##");
        
        System.out.println("El area del triangulo es: " + format.format(triangulo(5, 6, 8)));
		
		// 2 Escribir un metodo para encontrar el area y la circumferencia de un circulo dado el radio
		// Utilizar PI de la libreria de Java
		
		// 3 Escribir un metodo que muestre por consola la hora del sistema
		// Utilizar e investigar la libreria de Java

		// 4 Escribir un metodo que convierta n cantidad de segundos a (hora, minutos, segundos) segun sea el caso
		// ej 3600 = "1 hora = 60 min = 3600 seg"
                
                 //    System.out.println(true && false );
		
		// 5 Escribir un metodo para encontrar el volumen de una esfera dado el radio
		
		// 6 Escribir un metodo para encontrar el volumen de un cono a dado el radio y la altura
		
		// 7 Encontrar el area superficial de un cubo dado un lado a

		// 8 Escribir un metodo para descubrir si un año ingresado es bisiesto o no
		
		
		
		
		//----------------------------------------------------------------------------------------------
		
		// 1. Escribir mostrar en pantalla los primeros 100 numeros primos
		// 2. Escribir un programa para sumar 2 numeros sin usar operadores aritmeticos
		
		// 11. Escribir un método para verificar si un numero positivo de 2 digitos es palindromo
		// 12. Sin usar loops, escribir un metodo para sumar todos los digitos de un numero donde 99 >= n >= 10
		// 13. Escribir un método para remover espacios en blanco de un String. ej -> "Hola Mundo" -> "HolaMundo"
		// 15. Escribir un método para invertir un String. ej -> "Hola" -> "aloH" --- Sin usar loops

        
    }
    
    
    // 1 Escribir un metodo para encontrar el área de un triángulo a partir de 3 lados ingresados
    // Revisar si es un triángulo válido
    
    public static double triangulo(double a, double b,double c){
        
        
        double p = a + b + c;
        
        double s = p/2;
        
        double areaF = Math.sqrt(s * (s-a) * (s-b) * (s-c));
        
        return areaF;
    }
}
