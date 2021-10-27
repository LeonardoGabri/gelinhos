package Model;

import java.awt.image.DataBufferDouble;

public class Gelinho {
    private String sabor;
    private double valor = 1.50;
    private int quantidade;

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getValor() {
        return valor;
    }


    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Gelinho(String sabor,int quantidade) {
        setSabor(sabor);
        setQuantidade(quantidade);
    }

}
