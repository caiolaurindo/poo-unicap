package aula01_basico;

public class Quadrado {
    //Atributos
    double lado;

    //Construtores
    Quadrado(double lado){
        this.lado = lado;
    }

    Quadrado(){
        this.lado = 0;
    }

    //Metodos
    double area(){
        return this.lado * this.lado;
    }
    double perimetro(){
        return 4* this.lado;
    }
    void desenhar(){
        for(int i=0;i < this.lado;i++){
            for(int j=0; j < this.lado; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
