Calculadora de Imposto de Renda (Java)

Este projeto é um simulador de cálculo de imposto de renda feito em Java, utilizando conceitos de Programação Orientada a Objetos (POO), como:

- Abstração
- Herança
- Polimorfismo
- Encapsulamento

FUNCIONALIDADES

- Cadastro de múltiplos pagadores (Pessoa Física ou Jurídica)
- Cálculo de imposto com base nas regras:
  - Pessoa Física: 15% ou 25%, com desconto de 50% em despesas médicas
  - Pessoa Jurídica: 14% ou 16%, baseado no número de funcionários
- Exibição de imposto individual e total

ESTRUTURA DO PROJETO

- entities/ImpostoDeRenda.java
- entities/PessoaFisica.java
- entities/PessoaJuridica.java
- app/Programa_Imposto.java

TECNOLOGIAS

- Java 17+
- IntelliJ IDEA ou Eclipse

EXEMPLO DE USO

Digite o número de pagadores:
2
Pagador 1:
Pessoa Física ou Jurídica (f/j):
f
Nome:
Maria
Renda Anual:
30000
Despesas com saúde:
2000
Pagador 2:
Pessoa Física ou Jurídica (f/j):
j
Nome:
Loja ABC
Renda Anual:
400000
Número de Funcionários:
12

IMPOSTOS PAGOS:
Maria: 7000.00
Loja ABC: 56000.00

TOTAL DE IMPOSTOS PAGOS: R$ 63000.00

AUTOR

Projeto desenvolvido por [Seu Nome Aqui] como parte dos estudos em Programação Orientada a Objetos com Java.
