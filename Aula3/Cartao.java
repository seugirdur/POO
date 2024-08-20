public class Cartao {

    private double valorFatura;
    private TipoCliente tipoCLiente;

    public Cartao(double valorFatura, TipoCliente tipoCLiente) {
        this.valorFatura = valorFatura;
        this.tipoCLiente = tipoCLiente;
    }

    public double getValorFatura() {
        return valorFatura;
    }

    public TipoCliente getTipoCLiente() {
        return tipoCLiente;
    }

    public void calcDesconto() {
        switch (tipoCLiente) {
            case Gold:
                System.out.println("Desconto: R$ " + valorFatura * 0.1);
                System.out.println("Fatura Final: R$ " + (valorFatura - valorFatura * 0.1));
                break;
            case Silver:
                System.out.println("Desconto: R$ " + valorFatura * 0.05);
                System.out.println("Fatura Final: R$ " + (valorFatura - valorFatura * 0.05));
                break;
            case Platinum:
                System.out.println("Desconto: R$ " + valorFatura * 0.15);
                System.out.println("Fatura Final: R$ " + (valorFatura - valorFatura * 0.15));
                break;
            default:
                System.out.println("Tipo Cliente não encontrado!");
        }
    }
}
