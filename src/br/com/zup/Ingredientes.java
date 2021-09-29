package br.com.zup;

public class Ingredientes {

    private String nomeIngrediente;

    public Ingredientes() {

    }

    public Ingredientes(String nomeIngrediente) {
        this.nomeIngrediente = nomeIngrediente;
    }


    //get
    public String getNomeIngrediente() {
        return nomeIngrediente;
    }


    @Override
    public String toString() {

        StringBuilder Informacoes = new StringBuilder();
        Informacoes.append("\nIngredientes  " + nomeIngrediente);
        return Informacoes.toString();
    }
}

