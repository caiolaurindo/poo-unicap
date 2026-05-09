package lista02;

import java.util.ArrayList;

public class Animal {
    private long id;
    private int age;
    private double weigth;
    private ArrayList<String> abilities;

    public Animal(long id, int age, double weigth, ArrayList<String> abilities) {
        this.id = id;
        this.age = age;
        this.weigth = weigth;
        this.abilities = abilities;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public ArrayList<String> getAbilities() {
        return abilities;
    }

    public void setAbilities(ArrayList<String> abilities) {
        this.abilities = abilities;
    }

    public String emitirSom() {
        return "Som genérico de animal";
    }
    public String verificarHabilidade(String habilidade) {
        if (abilities != null && abilities.contains(habilidade)) {
            return "O animal possui a habilidade '" + habilidade + "'";
        } else {
            return "O animal NÃO possui a habilidade '" + habilidade + "'";
        }
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Idade: " + age + ", Peso: " + weigth;
    }


}
