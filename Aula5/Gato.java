public class Gato extends Animal {
    private String cor;

    // Construtor da classe Gato
    public Gato(String nome, String cor, int idade) {
        super(nome, idade); // Chama o construtor da superclasse Animal
        this.cor = cor; // Inicializa o atributo único da classe Gato
    }

    // Metodo para obter a cor do gato
    public String getCor() {
        return cor;
    }

    // Metodo específico da classe Gato
    public void miar() {
        System.out.println("O gato " + getNome() + " mia: Miau!");
    }

    // Sobrescrevendo o metodo emitirSom da classe Animal
    @Override
    public void emitirSom() {
        System.out.println("O gato " + getNome() + " faz um som: Miau!");
    }
}
