package aula02_exercicios;

public class Triangulo {
    int lado1, lado2, lado3;

    Triangulo(int lado){
        this.lado1 = lado;
        this.lado2 = lado;
        this.lado3 = lado;
    }

    Triangulo(int lado1, int lado2){
        this.lado1 = lado1;
        this.lado2 = lado1;
        this.lado3 = lado2;
    }

    Triangulo(int lado1, int lado2, int lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    int perimetro(){
        return lado1+lado2+lado3;
    }

    void tipo_do_triangulo( int lado1, int lado2, int lado3){
        if (lado1 == lado2 && lado2 == lado3){
            System.out.println("equilatero: todos os lados são iguais.");
        }
        else if (lado1 != lado2 && lado2 != lado3){
            System.out.println("escaleno: todos os lados são diferentes.");
        }
        else{
            System.out.println("isósceles: Tem pelo menos dois lados iguais");
        }
    }

    void exibir(){
        System.out.println("Todos os lados:" + lado1 + " e " + lado2 + " e " + lado3);
        System.out.println("Perimetro: "+ perimetro());
        System.out.print("Tipo: " );
        tipo_do_triangulo(lado1, lado2, lado3);
    }



}
