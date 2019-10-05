import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        testaSoma(calculadora);

    }

    private static void testaSoma(Calculadora calculadora){
        String inputs = JOptionPane.showInputDialog("Soma \n Por favor informe dois números separados por ; para realizarmos o teste de soma.");

        String inputsArray[] = inputs.split(";");
        float operador1 = Float.parseFloat(inputsArray[0]);
        float operador2 = Float.parseFloat(inputsArray[1]);

        float resultado = calculadora.somar(operador1,operador2);
        String mensagem = String.format("A soma de %s com %s resulta em %s",operador1,operador2,resultado);

        System.out.println(mensagem);

    }
}
