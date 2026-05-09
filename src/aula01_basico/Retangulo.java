package aula01_basico;

public class Retangulo {
    double base;
    double altura;

    Retangulo( double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    Retangulo(){
        this.base = 0;
        this.altura = 0;
    }

    double area(){
        return base*altura;
    }

}
