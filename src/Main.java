public class Main {
    public static void main(String[] args) {
        // Cria e exibe informações do Fornecedor
        System.out.println("\nFornecedor\n");
        Fornecedor fornecedor = new Fornecedor("Empresa ABC", "Rua 123, Cidade XYZ", "1234-5678", 50000.0, 15000.0);
        fornecedor.exibirInformacoesFornecedor();

        fornecedor.setValorCredito(60000.0);
        fornecedor.setValorDivida(20000.0);

        System.out.println("\nInformações atualizadas:");
        fornecedor.exibirInformacoesFornecedor();

        System.out.println("\n------------------------\n");

        // Cria e exibe informações do Empregado
        System.out.println("Empregado\n");
        Empregado empregado = new Empregado("João Silva", "Rua das Flores, 123", "9876-5432", 101, 3000.0, 15.0);
        empregado.exibirInformacoesEmpregado();

        empregado.setSalarioBase(3500.0);
        empregado.setImposto(10.0);

        System.out.println("\nInformações atualizadas:");
        empregado.exibirInformacoesEmpregado();

        System.out.println("\n------------------------\n");

        // Cria um objeto da classe Administrador
        System.out.println("Administrador\n");
        Administrador administrador = new Administrador("Maria Santos", "Avenida Central, 456", "9987-6543", 202, 4500.0, 12.0, 1500.0);
        administrador.exibirInformacoesAdministrador();

        administrador.setSalarioBase(5000.0);
        administrador.setImposto(10.0);
        administrador.setAjudaDeCusto(2000.0);

        System.out.println("\nInformações atualizadas:");
        administrador.exibirInformacoesAdministrador();

        System.out.println("\n------------------------\n");

        // Cria um objeto da classe Operario
        System.out.println("Operario\n");
        Operario operario = new Operario("Carlos Souza", "Rua dos Trabalhadores, 789", "9123-4567", 303, 2000.0, 10.0, 50000.0, 5.0);

        operario.exibirInformacoesOperario();

        operario.setValorProducao(60000.0);
        operario.setComissao(7.0);

        System.out.println("\nInformações atualizadas:");
        operario.exibirInformacoesOperario();

        System.out.println("\n------------------------\n");

        // Cria um objeto da classe Vendedor
        System.out.println("Vendedor\n");
        Vendedor vendedor = new Vendedor("Ana Pereira", "Rua das Vendas, 456", "9876-1234", 404, 2500.0, 8.0, 100000.0, 5.0);

        vendedor.exibirInformacoesVendedor();

        vendedor.setValorVendas(120000.0);
        vendedor.setComissao(7.0);

        System.out.println("\nInformações atualizadas:");
        vendedor.exibirInformacoesVendedor();

    }
}


