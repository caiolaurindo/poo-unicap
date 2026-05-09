package lista02;

import java.util.ArrayList;

public class Bird extends Animal {
    private String name = "Tweety";
    private String sound = "piu";
    private String habilidade = "fly";

    public Bird(long id, int age, double weigth, ArrayList<String> abilities, String name, String sound) {
        super(id, age, weigth, abilities);
        this.name = name;
        this.sound = sound;
        this.getAbilities().add(this.habilidade);
    }

    @Override
    public String emitirSom() {
        return sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }
}
