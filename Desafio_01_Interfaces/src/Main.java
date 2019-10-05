import javax.swing.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Object[] operacoes = {"Soma", "Subtracao", "Multiplicacao", "Divisão"};
        Object operacaoSelecionada = JOptionPane.showInputDialog(
                null,
                "Qual operaçao deseja realizar?", "Desafio Calculadora",
                JOptionPane.INFORMATION_MESSAGE, null,
                operacoes, operacoes[0]);
        Resultado resultado = null;

        switch (operacaoSelecionada.toString()) {
            case "Soma":
                resultado = testaSoma();
                break;
            case "Subtracao":
                resultado = testaSubtracao();
                break;
            case "Multiplicacao":
                resultado = testaMultiplicacao();
                break;
            case "Divisão":
                resultado = testaDivisao();
                break;
        }

        System.out.println(
                String.format(
                        "A operacao de %s do valor %s com %s resulta em %s",
                        resultado.getOperacao(),
                        resultado.getOperador1(),
                        resultado.getOperador2(),
                        resultado.getResultado()
                )
        );
    }

    private static Resultado testaSoma() {
        String userInput = JOptionPane.showInputDialog("*** SOMA *** \n Informe dois números separados por ;");
        Float[] inputs = convertStringArrayToFloatArray(userInput.split(";"));
        float resultado = new Calculadora().somar(inputs[0], inputs[1]);
        return new Resultado(inputs[0],inputs[1], resultado, "Soma");
    }

    private static Resultado testaSubtracao() {
        String userInput = JOptionPane.showInputDialog("*** SUBTRACAO *** \n Informe dois números separados por ;");
        Float[] inputs = convertStringArrayToFloatArray(userInput.split(";"));
        float resultado = new Calculadora().subtrair(inputs[0], inputs[1]);
        return new Resultado(inputs[0], inputs[1], resultado, "Subtraçao");
    }

    private static Resultado testaMultiplicacao(){
        String userInput = JOptionPane.showInputDialog("*** MULTIPLICAÇÃO *** \n Informe dois números separados por ;");
        Float[] inputs = convertStringArrayToFloatArray(userInput.split(";"));
        float resultado = new Calculadora().multiplicar(inputs[0],inputs[1]);
        return new Resultado(inputs[0], inputs[1], resultado, "Subtraçao");
    }

    private static Resultado testaDivisao(){
        String userInput = JOptionPane.showInputDialog("*** DIVISÃO *** \n Informe dois números separados por ;");
        Float[] inputs = convertStringArrayToFloatArray(userInput.split(";"));
        float resultado = new Calculadora().dividir(inputs[0],inputs[1]);
        return new Resultado(inputs[0], inputs[1], resultado, "Subtraçao");
    }

    private static Float[] convertStringArrayToFloatArray(String[] input){
        return Arrays.stream(input).map(Float::parseFloat).toArray(Float[]::new);
    }
}