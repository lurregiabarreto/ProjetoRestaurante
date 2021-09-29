package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {

    static List<Pratos> prato = new ArrayList<>();

    public Cardapio() {

    }

    public List<Pratos> getPrato() {
        return prato;
    }

    public Cardapio(List<Pratos> prato) {
        this.prato = prato;
    }

    public void setPrato(List<Pratos> prato) {
        this.prato = prato;
    }

    public static void adicionarPratos(Pratos pratosAdd) {
        prato.add(pratosAdd);

    }

    @Override
    public String toString() {
        StringBuilder Informacoes = new StringBuilder();
        Informacoes.append("Veja o nosso cardápio \n");
        Informacoes.append(prato);
        return Informacoes.toString();
    }

}

