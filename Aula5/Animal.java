public class Animal {
    private String nome;
    private int idade;

    // Construtor da classe Animal
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método para obter o nome do animal
    public String getNome() {
        return nome;
    }

    // Método para emitir som
    public void emitirSom() {
        System.out.println("O animal faz um som.");
    }
}
