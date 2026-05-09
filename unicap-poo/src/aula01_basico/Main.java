package aula01_basico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double lado = input.nextDouble();

        Quadrado quadrado = new Quadrado(lado);
        double area = quadrado.area();
        double perimetro = quadrado.perimetro();
        System.out.println(area);
        System.out.println(perimetro);
        quadrado.desenhar();


//        Retangulo r = new Retangulo(4, 2);
//        Retangulo r2 = new Retangulo(2, 4);
//        Retangulo r3 = new Retangulo();
//        System.out.println(r.area());
//        System.out.println(r2.area());
//        System.out.println(r3.area());
//


//        Circulo c = new Circulo(2);
//        Circulo c2 = new Circulo(3);
//
//
//        System.out.println(c.area());
//        System.out.println(c2.area());

    }
}