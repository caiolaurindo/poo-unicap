package aula01_associacao.ex01;

public class main {
    public static void main(String[] args) {
        Hora1 h1 = new Hora1(1,2,3);
        Data d1 = new Data(1,1,2005, h1);
        System.out.println("Dia: " + d1.dia);
        System.out.println("Mes: " + d1.mes);
        System.out.println("Ano: " + d1.ano);
        System.out.println("Hora:  " + d1.hora.horas);
        System.out.println("Minuto: " + d1.hora.minuto);
        System.out.println("Segundos: " + d1.hora.segundo);

    }
}
