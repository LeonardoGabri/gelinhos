package Model;

public class Vendas {
    private String nome;
    private String sabores;
    private int qntdVenda;
    private double desconto;
    private double valorTotal;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSabores() {
        return sabores;
    }

    public void setSabores(String sabores) {
        this.sabores = sabores;
    }

    public int getQntdVenda() {
        return qntdVenda;
    }

    public void setQntdVenda(int qntdVenda) {
        this.qntdVenda = qntdVenda;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }



    public Vendas(String nome, String sabores, int qntdVenda, double desconto, double valorTotal) {
        setNome(nome);
        setSabores(sabores);
        setQntdVenda(qntdVenda);
        setDesconto(desconto);
        setValorTotal(valorTotal);
        valorAPagar(getValorTotal(), getDesconto());
    }

    public double valorAPagar(double valorTotal, double desconto){
        setValorTotal(valorTotal);
        setDesconto(desconto);
        if (desconto > 0){
            valorTotal = valorTotal - desconto;
        }else if (desconto < 0){
            valorTotal = valorTotal;
        }
        return valorTotal;
    }
}
