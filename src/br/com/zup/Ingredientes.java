package br.com.zup;

public class Ingredientes {

    private String nomeIngrediente;

    public Ingredientes() {

    }

    public Ingredientes(String nomeIngrediente) {
        this.nomeIngrediente = nomeIngrediente;
    }


    //get e set
    public String getNomeIngrediente() {
        return nomeIngrediente;
    }

    public void setNomeIngrediente(String nomeIngrediente) {
        this.nomeIngrediente = nomeIngrediente;
    }

    @Override
    public String toString() {

        StringBuilder Informacoes = new StringBuilder();
        Informacoes.append("\nIngredientes  " + nomeIngrediente);
        return Informacoes.toString();
    }
}

