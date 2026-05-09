package lista02;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Zoo zoo = new Zoo();

        while (true) {
            System.out.println("\nESCOLHA UMA DAS OPÇÕES ABAIXO!");
            System.out.println("1- ADICIONAR ANIMAL");
            System.out.println("2- LISTAR TODOS OS ANIMAIS");
            System.out.println("3- REMOVER ANIMAL (POR ID)");
            System.out.println("4- EMITIR SOM DE ANIMAL (POR ID)");
            System.out.println("5- TESTAR HABILIDADE DE ANIMAL (POR ID)");
            System.out.println("6- SAIR DO PROGRAMA");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            if (escolha == 6) {
                System.out.println("Encerrando...");
                break;
            }

            switch (escolha) {

                case 1:
                    System.out.println("Qual tipo de animal?");
                    System.out.println("1 - Dog");
                    System.out.println("2 - Bird");
                    System.out.println("3 - Cat");

                    int tipo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite o ID:");
                    long id = scanner.nextLong();
                    scanner.nextLine();

                    System.out.println("Digite a idade:");
                    int idade = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite o peso:");
                    double peso = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("Digite o nome:");
                    String nome = scanner.nextLine();

                    ArrayList<String> habilidades = new ArrayList<>();

                    Animal animal = null;

                    switch (tipo) {
                        case 1:
                            animal = new Dog(id, idade, peso, habilidades, nome, "au au");
                            break;
                        case 2:
                            animal = new Bird(id, idade, peso, habilidades, nome, "piu");
                            break;
                        case 3:
                            animal = new Cat(id, idade, peso, habilidades, nome, "meow");
                            break;
                        default:
                            System.out.println("Tipo inválido!");
                    }

                    if (animal != null) {
                        zoo.addAnimal(animal);
                    }

                    break;

                case 2:
                    zoo.listarAnimais();
                    break;

                case 3:
                    System.out.println("Digite o ID:");
                    long idRemover = scanner.nextLong();
                    scanner.nextLine();

                    if (zoo.removerAnimal(idRemover)) {
                        System.out.println("Animal removido com sucesso!");
                    } else {
                        System.out.println("Animal não encontrado!");
                    }
                    break;

                case 4:
                    System.out.println("Digite o ID:");
                    long idSom = scanner.nextLong();
                    scanner.nextLine();

                    boolean encontrouSom = false;

                    for (Animal a : zoo.listarAnimaisRetorno()) {
                        if (a.getId() == idSom) {
                            System.out.println("Som: " + a.emitirSom());
                            encontrouSom = true;
                            break;
                        }
                    }

                    if (!encontrouSom) {
                        System.out.println("Animal não encontrado!");
                    }
                    break;

                case 5:
                    System.out.println("Digite o ID:");
                    long idHab = scanner.nextLong();
                    scanner.nextLine();

                    System.out.println("Digite a habilidade:");
                    String habilidade = scanner.nextLine();

                    boolean encontrouHab = false;

                    for (Animal a : zoo.listarAnimaisRetorno()) {
                        if (a.getId() == idHab) {
                            System.out.println(a.verificarHabilidade(habilidade));
                            encontrouHab = true;
                            break;
                        }
                    }

                    if (!encontrouHab) {
                        System.out.println("Animal não encontrado!");
                    }
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}