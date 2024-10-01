//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Gato meuGato = new Gato("Felix", "preto", 5);

        // Usando métodos da classe Gato e da classe Animal
        System.out.println("O gato " + meuGato.getNome() + " é " + meuGato.getCor() + ".");
        meuGato.miar(); // Método específico da classe Gato
        meuGato.emitirSom(); // Método sobrescrito da classe Animal

    }
}