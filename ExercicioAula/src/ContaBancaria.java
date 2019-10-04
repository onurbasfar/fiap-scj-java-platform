public abstract class ContaBancaria {
    private String titular;
    private double saldo;

    public void saque(double valor){
        saldo -= valor;
    }

    public void deposita(double valor){
        saldo += valor;
    }

    public double getSaldo(){
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public abstract String getTipo();

}
