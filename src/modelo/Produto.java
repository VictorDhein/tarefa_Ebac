package modelo;

import main.mercado;
import utilitario.Utilitario;

/**
 * @author Victor Emmanuel
 */
public class Produto {
    private static int count = 1;

private int id;
private mercado Produto;
private String nome;
private Double preco;

    public void produto(mercado produto) {
        Produto = produto;
    }

    public Produto(String nome, double preco) {
    }

    public void Produto(String nome, Double preco) {
    this.id = count;
    this.nome = nome;
    this.preco = preco;
    Produto.count = + 1;

}

public void mercado(mercado produto) {
    Produto = produto;
}

public int getId() {
    return id;
}


public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public Double getPreco() {
    return preco;
}

public void setPreco(Double preco) {
    this.preco = preco;
}

public String toString() {
    return "id: " + this.getId() +
            "\nNome: " + this.getNome() +
            "\nPreco: " + Utilitario.doubleToString(this.getPreco());
}
}