# 🏦 Simulador Bancário em Java

Aplicação de console desenvolvida para demonstrar os pilares fundamentais da **Programação Orientada a Objetos (POO)** em Java, com ênfase em **Herança**, **Polimorfismo**, **Encapsulamento** e **Sobrescrita de Métodos (`@Override`)**.

---

## 📌 Sobre o Projeto

O sistema simula a abertura e movimentação de contas bancárias através de um menu interativo no terminal. Cada modalidade de conta implementa regras de negócio específicas para saques, depósitos e rendimentos:

| Tipo de Conta | Características e Regras |
| :--- | :--- |
| **Conta Corrente** | Possui limite de **cheque especial**, permitindo saques além do saldo disponível até atingir o limite estipulado. |
| **Conta Poupança** | Aplica taxa de **rendimento de juros** sobre o saldo restante após as movimentações. |
| **Conta Salário** | Vinculada a uma **empresa empregadora**, herdando as operações padrão de movimentação bancária. |

---

## 🚀 Conceitos de POO Aplicados

- **Herança (`extends`):** A classe base `ContaBancaria` centraliza os atributos e comportamentos comuns (como `saldo`, `depositar` e `exibirSaldo`), enquanto as classes filhas herdam e especializam seus comportamentos.
- **Sobrescrita de Métodos (`@Override`):** A `ContaCorrente` sobrescreve a lógica do método `sacar()` para incluir a verificação do limite do cheque especial.
- **Polimorfismo:** A referência genérica `ContaBancaria conta` é capaz de instanciar qualquer subtipo de conta em tempo de execução.
- **Operador `instanceof` e Type Casting:** Identificação dinâmica da `ContaPoupanca` para invocação segura do método exclusivo `aplicarJuros()`.

---

## 📂 Estrutura de Pastas

```text
sistema-bancario/
├── src/
│   └── Banco/
│       ├── ContaBancaria.java   # Classe Base
│       ├── ContaCorrente.java   # Herança com Cheque Especial
│       ├── ContaPoupanca.java   # Herança com Aplicação de Juros
│       ├── ContaSalario.java    # Herança com Vínculo Empregador
│       └── Appbanco.java        # Interface de Console (Execução)
├── .gitignore
└── README.md

🛠️ Como Executar

Clone o repositório:

git clone https://github.com/SEU-USUARIO/sistema-bancario.git
cd sistema-bancario

Compile o projeto:

javac -d out src/Banco/*.java

Execute a aplicação:

java -cp out Banco.Appbanco

👨‍💻 Autor

Desenvolvido por Marcos como projeto prático de Programação Orientada a Objetos em Java.