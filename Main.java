import com.aula.Aluno;
import com.aula.Cachorro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Cachorro cachorro = new Cachorro();
        // cachorro.setNome("Sandy");
        //cachorro.latir();

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Leonardo";
        aluno1.cpf = "111222333-44";
        aluno1.idade = 20;
        aluno1.exibir();

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Gabriel";
        aluno2.cpf = "111222333-44";
        aluno2.idade = 21;
        aluno2.exibir();

        Aluno aluno3 = new Aluno();
        aluno3.nome = "Victor";
        aluno3.cpf = "111222333-44";
        aluno3.idade = 38;
        aluno3.exibir();
    }
}