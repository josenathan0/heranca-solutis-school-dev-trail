public class Vendedor extends Empregado {
    private double valorVendas;
    private double comissao;

    public Vendedor() {
    }
    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        double salarioBase = super.calcularSalario();
        double valorComissao = valorVendas * (comissao / 100);
        return salarioBase + valorComissao;
    }

    public void exibirInformacoesVendedor() {
        exibirInformacoesEmpregado();
        System.out.println("Valor das Vendas: " + valorVendas);
        System.out.println("Comissão: " + comissao + "%");
        System.out.println("Salário Total: " + calcularSalario());
    }
}
