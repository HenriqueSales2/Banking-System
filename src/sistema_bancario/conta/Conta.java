package sistema_bancario.conta;
public class Conta {
    
    private String nome;
    private String senha;
    private double saldo;
    private double chequeEspecial;

    public Conta(String nome, String senha, double saldo) {
        this.nome = nome;
        this.senha = senha;
        this.saldo = saldo;
        this.chequeEspecial = calcularChequeEspecial(saldo);
    }

    private double calcularChequeEspecial(double saldo) {
        if (saldo < 500) {
            return (saldo / 100) * 10; // 10% do saldo como cheque especial
        } else {
            return (saldo / 100) * 50; // 50% do saldo como cheque especial
        }
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }
}
