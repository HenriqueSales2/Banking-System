
# 💳 Banking System in Java

This is a simple **Banking System** project developed in Java, aimed at demonstrating concepts of **Object-Oriented Programming (OOP)**, **control structures**, **terminal-based user input**, and **package organization**.

## 📌 Project Purpose

The project simulates a basic banking system in which the user can create an account, check their balance, overdraft limit, deposit money, withdraw money, pay bills, and verify if they are using the overdraft limit.

## 🛠️ Features

- Account creation with name, password, and initial balance
- Automatic overdraft limit calculation based on balance
- Balance inquiry
- Overdraft limit inquiry
- Money deposit
- Money withdrawal
- Bill payment
- Overdraft usage check

## 🧱 Project Structure

```
sistema_bancario/
├── conta/
│   └── Conta.java
└── Main.java
```

## 🧠 System Logic

### 📄 `Conta.java`

Represents a bank account.

#### Attributes:

- `name`: Account holder's name
- `password`: Access password
- `balance`: Current account balance
- `overdraftLimit`: Credit limit calculated based on the balance

#### Business Rules:

- If the balance is less than R$500, overdraft is 10% of the balance
- If the balance is R$500 or more, overdraft is 50% of the balance

#### Methods:

- `getName()`
- `getPassword()`
- `getBalance()`
- `getOverdraftLimit()`

### 📄 `Main.java`

Main class responsible for user interaction via the terminal.

#### Main Flow:

1. Creates a predefined account (name: Henrique, password: 123456, balance: 4000)
2. Displays options to the user
3. Executes selected operations in a loop until the user chooses to exit

#### Available Features:

| Option | Action                                      |
|--------|---------------------------------------------|
| 1      | Check Balance                               |
| 2      | Check Overdraft Limit                       |
| 3      | Deposit Money                               |
| 4      | Withdraw Money                              |
| 5      | Pay a Bill                                  |
| 6      | Check if account is using overdraft         |

## ⚠️ Current Limitations

- Deposit, withdrawal, and bill payment do **not actually update the account's real balance**, since balance is passed as a primitive (`double`) and modified only locally.
- Account data is hardcoded (Henrique, 123456, R$4000) — no user input for account creation.
- No password verification for secure login.
- Simple terminal interface, no graphical interface or data persistence.

## 💡 Future Improvements

- Make the balance a modifiable instance variable.
- Allow users to create accounts with their own input.
- Implement login authentication with name and password.
- Add data persistence using files or a database.
- Create subclasses for different account types.
- Develop a graphical user interface (GUI) or RESTful API for broader access.

## 💻 Example Output

```
Welcome to our bank!
Here you can create your account and perform banking operations.
Enter '1' to continue registration or '0' to exit
1
Welcome Henrique!
Here are some options our bank offers: 
-----------------
1 - Check Balance
2 - Check Overdraft Limit
3 - Deposit Money
4 - Withdraw Money
5 - Pay a Bill
6 - Check if account is using overdraft
-----------------
Which one would you like? (enter the option number)
```

## 🧑‍💻 Technologies Used

- Language: **Java**
- Tools: `javac`, `java` (Java compiler and runtime)
- Modular structure using `package`

## 📜 License

This project is licensed under the MIT License. Feel free to use, modify, and distribute it as needed.
