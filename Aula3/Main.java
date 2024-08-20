public class Main {

    public static void main(String[] args) {

//        Aluno a = new Aluno("Arthur", "005012041511", Curso.ADS);
//        a.mostrar();
//        a.verEsteriotipo();

//        System.out.println(a.getRA());
//        System.out.println(a.getNome());
//        System.out.println(a.getCurso());

//        -------------------------------------------------------------

//        Disciplina d =  new Disciplina("Cobol", 7, 4);
//        d.mostrar();
//        d.mostrarStatus();
//
//        d.setP1(10);
//
//        d.mostrarStatus();

//        -------------------------------------------------------------

        Cartao cartao = new Cartao(1000, TipoCliente.Silver);
        System.out.println(cartao.getTipoCLiente());
        System.out.println(cartao.getValorFatura());
        cartao.calcDesconto();

    }

}