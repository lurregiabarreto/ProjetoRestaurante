package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {
    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    // Exibir possibilidades
    public static void menu() {
        System.out.println("Bem vindo ao Restaurante Barreto ");
        System.out.println("Digite 1 - Para cadastrar um prato e adicionar seus ingredientes . ");
        System.out.println("Digite 2 - Para exibir os pratos . ");
        System.out.println("Digite 3 - Para sair");
    }


    //Casatrando os pratos
    public static Pratos cadastrarPratos() {
        String nomeDoPrato = capturarDados("Digite o nome do prato : ").nextLine();
        double valorDoPrato = capturarDados("Digite o valor do prato : ").nextDouble();
        Pratos prato = new Pratos();
        List listaDeIngredientes = listaDeIngredientes();
        prato.setIngrediente(listaDeIngredientes);
        prato.setNomeDoPrato(nomeDoPrato);
        prato.setValorDoPrato(valorDoPrato);
        return prato;
    }

    public static List listaDeIngredientes() {
        List<Ingredientes> listaIngredientes = new ArrayList<>();
        listaIngredientes.add(cadastrarIngridiente());
        return listaIngredientes;

    }

    //Cadastrandos os ingredientes
    public static Ingredientes cadastrarIngridiente() {
        String ingredientes = capturarDados("Digite os ingredientes que compõe esse prato : ").nextLine();
        List<Ingredientes> listaIngredientes = new ArrayList<>();
        Ingredientes ingrediente = new Ingredientes();
        ingrediente.setNomeIngrediente(ingredientes);
        return ingrediente;


    }

    public static void executar() {
        boolean menu = true;
        Cardapio cardapio = new Cardapio();

        while (menu) {


            menu();
            int opcaoDoUsuario = capturarDados("Digite a opção desejada: ").nextInt();
            switch (opcaoDoUsuario) {
                case 1:
                    Pratos pratos = cadastrarPratos();
                    Ingredientes ingredientes = cadastrarIngridiente();
                    Cardapio.adicionarPratos(pratos);


                    break;
                case 2:
                    System.out.println(cardapio);
                    break;
                case 3:
                    System.out.println("Obrigado pela preferencia no restaurante Barreto , volte sempre :) ");
                    menu = false;
                    break;
            }
        }

    }
}

