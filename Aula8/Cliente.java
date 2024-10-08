//Overload eh basicamente vc criar o mesmo nome de metodo com parametro diferente, cada um serve seu proposito

public class Cliente {
    private int id;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    private String nome, cpf;


    //Update
    public Cliente(int id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    //Insert
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
}
