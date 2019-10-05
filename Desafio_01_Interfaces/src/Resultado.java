public class Resultado {
    private float operador1;
    private float operador2;
    private float resultado;
    private String operacao;

    public Resultado(float operador1, float operador2, float resultado, String operacao) {
        this.operador1 = operador1;
        this.operador2 = operador2;
        this.resultado = resultado;
        this.operacao = operacao;
    }

    public float getOperador1() {
        return operador1;
    }

    public float getOperador2() {
        return operador2;
    }

    public float getResultado() {
        return resultado;
    }

    public String getOperacao() {
        return operacao;
    }
}


