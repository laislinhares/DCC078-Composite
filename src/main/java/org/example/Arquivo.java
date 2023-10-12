package org.example;

public class Arquivo extends Explorer {
    private String extensao;

    public Arquivo(String descricao, String extensao) {
        super(descricao);
        this.extensao = extensao;
    }

    public String getExtensao() {
        return extensao;
    }

    public void setExtensao(String extensao) {
        this.extensao = extensao;
    }

    public String getConteudo() {
        return "Arquivo: " + this.getDescricao() + " - extensao: " + this.extensao + "\n";
    }
}
