public class Aluno {

//    Maioria dos casos (incluindo a prova):
//    Metodo/Construtor ----> public
//    Atributo -------------> private

//    public: Libera acesso do membro para todas as classes
//    default (no modified): Libera acesso para classes do mesmo pacote (mesma pasta)
//    private: Libera acesso apenas para a própria classe

    private String nome, ra;
    private Curso curso;

    public Aluno(String nome, String ra, Curso curso) {
        this.nome = nome;
        this.ra = ra;
        this.curso = curso;
    }

    public void mostrar() {
        System.out.println("Nome: " + nome);
        System.out.println("RA: " + ra);
        System.out.println("Curso: " + curso);
    }

    public void verEsteriotipo() {
        switch (curso) {
            case ADS:
                System.out.println("COBOLEIRO");
                break;
            default:
                System.out.println("NÃO SEI");
        }
    }

    public String getRA() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
