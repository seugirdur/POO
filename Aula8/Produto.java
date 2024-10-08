public class Produto {
    private int id;
    private int preco;
    private int nome;

    public Produto(int preco, int nome) {
        this.preco = preco;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public int getPreco() {
        return preco;
    }

    public int getNome() {
        return nome;
    }

    public Produto(int id, int preco, int nome) {
        this.id = id;
        this.preco = preco;
        this.nome = nome;
    }
}
