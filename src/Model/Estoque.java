package Model;

public class Estoque {
    private Gelinho gelinho;
    private int qntdEstoque;

    public Gelinho getGelinho() {
        return gelinho;
    }

    public void setGelinho(Gelinho gelinho) {
        this.gelinho = gelinho;
    }

    public int getQntdEstoque() {
        return qntdEstoque;
    }

    public void setQntdEstoque(int qntdEstoque) {
        this.qntdEstoque = qntdEstoque;
    }

    public Estoque(Gelinho gelinho, int qntdEstoque) {
        setGelinho(gelinho);
        setQntdEstoque(qntdEstoque);
    }
}
