package EjerciciosLogica;


import java.text.DecimalFormat;
import java.util.Date;

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
        
        circulo(5);
        
        horaSystem();
        
        cantidadSeg(18000);
        
        volumenEsfera(8);
        
        volumenCono(8, 18);
        
        areaCubo(5);
        
        int year = 1900;
        
        if (yearBisiesto(year)) {
            System.out.println(year + " es bisiesto");
        } else {
            System.out.println(year + " no es bisiesto");
        }
        
        numerosPrimos();
       
        System.out.println("La suma aritmentica es: " + sumaAritmetica(5, 7));
        
        System.out.println(numeroPalindromo(10));
        
        System.out.println(sumaDigitos(56));
        
        
        System.out.println(eliminarEspacios("Hola Mundo"));
        
        System.out.println(invertirCadena("Hola Mundo"));

                 //    System.out.println(true && false );
		
		
    }
    
    
    // 1 Escribir un metodo para encontrar el área de un triángulo a partir de 3 lados ingresados
    // Revisar si es un triángulo válido
    
    public static double triangulo(double a, double b,double c){
        
        double p = a + b + c;
        double s = p/2;
        double areaF = Math.sqrt(s * (s-a) * (s-b) * (s-c));
        
        double verificar = a + b;
        
        if(verificar > c){
            System.out.println("Es un triangulo valido");
        }else{
            System.out.println("No es un triangulo valido");
        }
        
        return areaF;
    }
    
    // 2 Escribir un metodo para encontrar el area y la circumferencia de un circulo dado el radio
    // Utilizar PI de la libreria de Java
    public static void circulo(double radio){
        
        double area = Math.PI * radio * radio;
        
        double perimetro = 2 * Math.PI * radio;
        
         DecimalFormat format = new DecimalFormat("#.##");
        
        System.out.println("El perimetro del circulo es: " + perimetro);
        System.out.println("El area del circulo es: " + area);
        
    }
    
    
    // 3 Escribir un metodo que muestre por consola la hora del sistema
    // Utilizar e investigar la libreria de Java
    
    public static void horaSystem(){
        
        Date date = new Date();
        
        System.out.println("La hora del sistema es: " + date);
    }
    
    // 4 Escribir un metodo que convierta n cantidad de segundos a (hora, minutos, segundos) segun sea el caso
    // ej 3600 = "1 hora = 60 min = 3600 seg"
    
    public static double cantidadSeg(double segundos){
        
       double hora = 3600;
       
       double res = segundos / hora;
       
       System.out.println(segundos + " segundos equivale a " + res + " horas");
       
       return segundos;
              
    }
    
    // 5 Escribir un metodo para encontrar el volumen de una esfera dado el radio
    public static double volumenEsfera(double radio){
        
        double volumen = (4.0/3.0) * Math.PI * radio * radio * radio;
        
        System.out.println("El volumen de la esfera es: " + volumen);
        
        return volumen;
    }
    
    // 6 Escribir un metodo para encontrar el volumen de un cono a dado el radio y la altura
    
    public static double volumenCono(double radio,double altura){
        
        double volumen = (1.0/3.0) * Math.PI * radio * radio * altura;
        
        System.out.println("El volumen del cono es: " + volumen);
        
        return volumen;
                
    }
    
    // 7 Encontrar el area superficial de un cubo dado un lado a
    
    public static double areaCubo(double lado){
        
        double area = Math.pow(lado, 2) * 6;
        
        System.out.println("El area de la superficie del cubo es: " + area);
        
        return area;
    }
    
    // 8 Escribir un metodo para descubrir si un año ingresado es bisiesto o no
    public static boolean yearBisiesto(int year){
         
        if (year % 4 != 0) {
        return false;
    } else if (year % 400 == 0) {
        return true;
    } else if (year % 100 == 0) {
        return false;
    } else {
        return true;
    }
    }
    
    // 1. Escribir mostrar en pantalla los primeros 100 numeros primos
    public static void numerosPrimos(){
        
        for(int i=0; i<200; i++){
            if(i %2 == 0){
            System.out.println(i);
            
            }
        }
    }
    
    
    // 2. Escribir un programa para sumar 2 numeros sin usar operadores aritmeticos
 
    public static int sumaAritmetica(int num1, int num2){
        while (num2 != 0) {
            int carry = num1 & num2; // Encuentra los bits que se van a llevar
            num1 = num1 ^ num2; // Suma los bits sin llevar
            num2 = carry << 1; // Lleva los bits al siguiente bit
        }
        return num1;
    }
    
    
    // 11. Escribir un método para verificar si un numero positivo de 2 digitos es palindromo
    public static boolean numeroPalindromo(int num){
        
        if(num < 10 || num > 99){
           
             System.out.println("El numero no corresponde a 2 digitos");
             return false;
            
            
        }
            int digito1 = num / 10;
            int digito2 = num % 10;
            
            return digito1 == digito2;
        
       
    }
    
    //Sin usar loops, escribir un metodo para sumar todos los digitos de un numero donde 99 >= n >= 10
    public static int sumaDigitos(int num) {
        
        if (num < 10 || num > 99) {
            return -1; // el número no tiene 2 dígitos
        }
        int digito1 = num / 10; // primer dígito
        int digito2 = num % 10; // segundo dígito
        return digito1 + digito2; // devuelve la suma de los dígitos
    }
    
    // 13. Escribir un método para remover espacios en blanco de un String. ej -> "Hola Mundo" -> "HolaMundo"
    public static String eliminarEspacios(String cadena) {
        
        String nuevaCadena = cadena.replaceAll("\\s", "");
        return nuevaCadena;
    }
    
    
		
    // 15. Escribir un método para invertir un String. ej -> "Hola" -> "aloH" --- Sin usar loops
    public static String invertirCadena(String cadena) {
        if (cadena == null || cadena.length() <= 1) {
            return cadena;
        }
        return cadena.charAt(cadena.length() - 1) + invertirCadena(cadena.substring(0, cadena.length() - 1));
    }
}
