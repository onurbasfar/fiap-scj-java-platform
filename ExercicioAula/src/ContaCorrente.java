public class ContaCorrente extends ContaBancaria{

    @Override
    public void saque(double valor){
        super.saque(valor + 0.10);
    }

    @Override
    public String getTipo(){
        return "Conta Corrente";
    }

}
