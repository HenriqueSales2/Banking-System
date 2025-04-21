
# 💰 Sistema Bancário em Java

Este projeto é um sistema bancário simples desenvolvido em Java, com funcionalidades básicas como consulta de saldo, saque, depósito, pagamento de boletos e verificação de uso do cheque especial. Ele é ideal para iniciantes que desejam praticar lógica de programação, entrada de dados via console e conceitos de orientação a objetos.

## 📌 Funcionalidades

- ✅ Criação de conta bancária com nome, senha e saldo inicial.
- 📄 Consulta de saldo disponível.
- 🏦 Consulta do limite de cheque especial.
- ➕ Depósito em conta.
- ➖ Saque de valores.
- 💸 Pagamento de boletos.
- ⚠️ Verificação se o usuário está utilizando o cheque especial.

## 🛠️ Tecnologias Utilizadas

- Java 11+
- IDE de sua preferência (Eclipse, IntelliJ, VSCode etc.)
- Terminal para entrada de dados

## 📁 Estrutura do Projeto

```
sistema_bancario/
├── conta/
│   └── Conta.java        # Classe que representa uma conta bancária
└── Main.java             # Classe principal com lógica de interação
```

### 🔹 `Conta.java`

A classe `Conta` armazena os dados da conta do usuário:

- `nome` — nome do titular
- `senha` — senha da conta
- `saldo` — saldo inicial
- `chequeEspecial` — limite de cheque especial (calculado com base no saldo)

Regras para o cheque especial:
- Se o saldo for menor que R$500 → limite de 10%
- Se o saldo for maior ou igual a R$500 → limite de 50%

### 🔹 `Main.java`

Interface via terminal que permite ao usuário interagir com o sistema bancário. As opções disponíveis incluem:

1. Consultar saldo  
2. Consultar cheque especial  
3. Depositar dinheiro  
4. Sacar dinheiro  
5. Pagar boleto  
6. Verificar uso do cheque especial

A aplicação utiliza `Scanner` para capturar as opções do usuário e processá-las em tempo real.

## ▶️ Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/sistema-bancario-java.git
   ```
2. Navegue até o diretório do projeto.
3. Compile o código:
   ```bash
   javac sistema_bancario/conta/Conta.java sistema_bancario/Main.java
   ```
4. Execute o programa:
   ```bash
   java sistema_bancario.Main
   ```

## 🎯 Objetivo do Projeto

Este projeto foi criado com fins educacionais para reforçar os conceitos de:

- Programação orientada a objetos (POO)
- Operações com dados numéricos
- Manipulação de entrada via terminal
- Estrutura de controle (condições, loops, switch-case)

---

Sinta-se à vontade para clonar, modificar e usar esse projeto como base para estudos!
