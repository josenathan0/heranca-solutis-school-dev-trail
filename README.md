# Herança em Java - Solutis School Dev Trail

Este projeto é uma demonstração de conceitos de herança e abstração em Java. Ele foi desenvolvido como parte de uma atividade prática para explorar como classes base e derivadas podem ser usadas para modelar diferentes tipos de entidades em um sistema.

## Estrutura do Projeto

O projeto contém classes que modelam diferentes tipos de pessoas, empregados e suas especializações, como fornecedores, administradores, operários e vendedores. Essas classes estão organizadas em um pacote chamado `src`.

### Classes

1. **`Pessoa.java`**:
   - A classe base que contém os atributos e métodos comuns para todas as pessoas, como `nome`, `endereco`, e `telefone`.
   - Esta classe é utilizada como base para classes mais especializadas.

2. **`Empregado.java`**:
   - Extende `Pessoa` e adiciona atributos específicos para empregados, como `codigoSetor`, `salarioBase`, e `imposto`.
   - Inclui o método `calcularSalario()`, que calcula o salário após dedução de impostos.

3. **`Fornecedor.java`**:
   - Extende `Pessoa` e adiciona atributos específicos para fornecedores, como `valorCredito` e `valorDivida`.
   - Inclui o método `obterSaldo()`, que calcula o saldo disponível para o fornecedor.

4. **`Administrador.java`**:
   - Extende `Empregado` e adiciona o atributo `ajudaDeCusto`.
   - Redefine o método `calcularSalario()` para incluir as ajudas de custo no cálculo do salário final.

5. **`Operario.java`**:
   - Extende `Empregado` e adiciona os atributos `valorProducao` e `comissao`.
   - Redefine o método `calcularSalario()` para incluir a comissão com base no valor da produção.

6. **`Vendedor.java`**:
   - Extende `Empregado` e adiciona os atributos `valorVendas` e `comissao`.
   - Redefine o método `calcularSalario()` para incluir a comissão com base no valor das vendas.

7. **`Main.java`**:
   - Classe principal que contém o método `main()`.
   - Utilizada para testar as funcionalidades das outras classes, criando instâncias e exibindo resultados.

## Funcionamento Geral

O projeto foi desenvolvido para demonstrar como classes abstratas e herança podem ser usadas para criar um sistema de entidades relacionadas. Cada classe especializada adiciona ou redefine funcionalidades específicas, mostrando a flexibilidade do uso de herança em Java.

### Exemplo de Uso

Aqui está um exemplo de como uma instância de um `Vendedor` pode ser criada e utilizada:

```java
Vendedor vendedor = new Vendedor("Ana Pereira", "Rua das Vendas, 456", "9876-1234", 404, 2500.0, 8.0, 100000.0, 5.0);
System.out.println("Salário do Vendedor: " + vendedor.calcularSalario());
```
## Compilação e Execução

Para compilar e executar o projeto, siga as instruções abaixo:

1. **Compile todas as classes:**
   
   ```bash
   javac src/*.java
   ```
   
2. **Execute a classe principal:**

   ```bash
   java src.Main
   ```
### Conclusão
Esta atividade demonstra de forma prática o uso de herança em Java para modelar um sistema de classes que representa diferentes tipos de pessoas e seus papéis específicos em uma organização. É um exemplo claro de como essas técnicas podem ser usadas para criar código flexível, reutilizável e de fácil manutenção.
   
