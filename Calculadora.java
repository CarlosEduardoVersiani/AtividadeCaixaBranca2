package calculadora;

/**
 * A classe Calculadora realiza operações aritméticas básicas.
 */

public class Calculadora {

        /**
     * Executa uma operação aritmética entre dois números.
     *
     * @param a O primeiro operando.
     * @param b O segundo operando.
     * @param op A operação a ser realizada ("+", "-", "*", "/").
     * @return O resultado da operação.
     * @throws IllegalArgumentException se a operação for inválida ou se ocorrer uma divisão por zero.
     */
    public int calc(int a, int b, String op) {
        int resultado;
        switch (op) {
            case "+":
                resultado = a + b;
                break;
            case "-":
                resultado = a - b;
                break;
            case "*":
                resultado = a * b;
                break;
            case "/":
                if (b == 0) {
                    throw new IllegalArgumentException("Divisão por zero não é permitida.");
                }
                resultado = a / b;
                break;
            default:
                throw new IllegalArgumentException("Operação inválida: " + op);
        }
        return resultado;
    }
}
