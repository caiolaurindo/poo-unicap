package lista02;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
        System.out.println("Animal: " + animal + " adicionado com sucesso!");
    }

    public void listarAnimais() {
        if (animals.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
            return;
        }

        for (Animal a : animals) {
            System.out.println(a);
        }
    }
    public ArrayList<Animal> listarAnimaisRetorno() {
        return animals;
    }

    public boolean removerAnimal(long id) {
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).getId() == id) {
                animals.remove(i);
                return true;
            }
        }
        return false;
    }
}