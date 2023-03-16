package com.mycompany.cap3_ejer21;
import java.util.Scanner;
public class Cap3_ejer21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a, b, c, perimetro;
        double area, semi;

        System.out.print("ingrese lado 1: ");
        a = entrada.nextInt();

        System.out.print("ingrese lado 2: ");
        b = entrada.nextInt();

        System.out.print("ingrese lado 3: ");
        c = entrada.nextInt();

        perimetro = a + b + c;
        semi = (a + b + c) / 2;
        area = Math.sqrt(semi * (semi - a) * (semi - b) * (semi - c));
        
        System.out.println("dame el valor de un lado del triangulo: ");
        System.out.println("area:" + area);
        System.out.println("semiperimetro: " + semi);
        System.out.println("perimetro: " + perimetro);
    }
}
