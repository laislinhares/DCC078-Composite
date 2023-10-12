package org.example;

import java.util.ArrayList;
import java.util.List;

public class Pasta extends Explorer {
    private List<Explorer> arquivos;

    public Pasta(String descricao) {
        super(descricao);
        this.arquivos = new ArrayList<Explorer>();
    }

    public void addExplorer(Explorer explorer) {
        this.arquivos.add(explorer);
    }

    public String getConteudo() {
        String saida = "";
        saida = "Pasta: " + this.getDescricao() + "\n";
        for (Explorer explorer : arquivos) {
            saida += explorer.getConteudo();
        }
        return saida;
    }
}
