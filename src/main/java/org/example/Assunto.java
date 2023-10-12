package org.example;

public class Assunto {
    private Explorer nome;

    public void setNome(Explorer nome) {
        this.nome = nome;
    }

    public String getNome() {
        if (this.nome == null) {
            throw new NullPointerException("Assunto sem pasta");
        }
        return this.nome.getConteudo();
    }
}
