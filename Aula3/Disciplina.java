public class Disciplina {

    private String nome;
    private double p1, p2;

    public Disciplina(String nome, double p1, double p2) {
        this.nome = nome;
        this.p1 = Math.max(0, p1);
        this.p2 = Math.max(0, p2);
    }

    public void mostrar() {
        System.out.println(nome);
        System.out.println(p1);
        System.out.println(p2);
    }


    public void mostrarStatus() {
        double media = 0.5 * (p1 + p2);
        if (media >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }

    public void setP1(int p1) {
        this.p1 = p1;
    }

}
