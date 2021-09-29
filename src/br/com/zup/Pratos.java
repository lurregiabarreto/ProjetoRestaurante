package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Pratos {

    private String nomeDoPrato;
    private double valorDoPrato;
    private List<Ingredientes> ingrediente = new ArrayList<>();

    //Construtores
    public Pratos() {

    }

    public Pratos(String nomeDoPrato, double valorDoPrato, List<Ingredientes> ingrediente) {
        this.nomeDoPrato = nomeDoPrato;
        this.valorDoPrato = valorDoPrato;
        this.ingrediente = ingrediente;
    }
    // get e set

    public String getNomeDoPrato() {
        return nomeDoPrato;
    }

    public void setNomeDoPrato(String nomeDoPrato) {
        this.nomeDoPrato = nomeDoPrato;
    }

    public double getValorDoPrato() {
        return valorDoPrato;
    }

    public void setValorDoPrato(double valorDoPrato) {
        this.valorDoPrato = valorDoPrato;
    }

    public List<Ingredientes> getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(List<Ingredientes> ingrediente) {
        this.ingrediente = ingrediente;
    }

    //Método para adicionar ingrediente

    public void adicionarIngredientes(Ingredientes addIngrediente) {
        ingrediente.add(addIngrediente);
    }

    @Override
    public String toString() {
        StringBuilder Informacoes = new StringBuilder();
        Informacoes.append("\nNome do Prato: " + nomeDoPrato);
        Informacoes.append("\nValor R$: " + valorDoPrato);
        Informacoes.append("\t\n# Ingredientes # \n" + ingrediente);
        return Informacoes.toString();
    }


}
