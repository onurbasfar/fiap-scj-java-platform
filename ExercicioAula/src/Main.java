public class Main {

    public static void main(String[] args) {
        testaContaCorrente();
        testaContaPoupanca();
    }

    private static void testaContaCorrente(){
        ContaCorrente cc1 = new ContaCorrente();
        cc1.setTitular("Jose Ferreira");
        System.out.println(cc1.getTitular());
        System.out.println(cc1.getTipo());
        cc1.deposita(100);
        System.out.println(cc1.getSaldo());
        cc1.saque(10);
        System.out.println(cc1.getSaldo());
    }

    private static void testaContaPoupanca(){
        ContaPoupanca cp1 = new ContaPoupanca();
        System.out.println(cp1.getTipo());
        cp1.setTitular("Maria da Silva");
        System.out.println(cp1.getTitular());
        cp1.deposita(100);
        System.out.println(cp1.getSaldo());
        cp1.saque(10);
        System.out.println(cp1.getSaldo());
    }
}
