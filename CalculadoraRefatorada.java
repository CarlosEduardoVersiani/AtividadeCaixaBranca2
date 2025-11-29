package calculadora;

/**
 * <p>Projeto Calculadora</p>
 * 
 * <p>Esta classe fornece operações matemáticas básicas como soma, subtração,
 * multiplicação e divisão, além de um método principal que seleciona a operação
 * desejada com base em um operador informado pelo usuário.</p>
 * 
 * <p>Após a refatoração, os métodos desta classe são <strong>métodos puros</strong>,
 * permitindo maior legibilidade e facilitando testes unitários.</p>
 * 
 * @author Time de Risk Analytics
 * @version 1.0
 */
public class CalculadoraRefatorada {

    public int r = 0;

    /**
     * Soma dois números inteiros.
     * 
     * @param a primeiro operando
     * @param b segundo operando
     * @return a resultado da soma (@code a + b)
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Preenchimento com o devido comentário
     * 
     * @param a primeiro operando
     * @param b segundo operando
     * @return a resultado da subtração
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Preenchimento com o devido comentário
     * 
     * @param a primeiro operando
     * @param b segundo operando
     * @return a resultado da multiplicação
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Preenchimento com o devido comentário
     * 
     * @param a primeiro operando
     * @param b segundo operando
     * @return a resultado da divisão
     * @throws IllegalArgumentException se o operador não for um símbolo válido
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida");
        }
        return a / b;
    }

    /**
     * Executa a operação matemática solicitada com base no operador informado.
     * 
     * <p>Operadores aceitos:</p>
     * <ul>
     *   <li>"+": Soma</li>
     *   <li>"-": Subtração</li>
     *   <li>"*": Multiplicação</li>
     *   <li>"/": Divisão</li>
     * </ul>
     * 
     * @param a primeiro operando
     * @param b segundo operando
     * @param operador símbolo da operação desejada
     * @return o resultado da operação correspondente ao operador informado
     * @throws IllegalArgumentException se o operador não for um símbolo válido
     */
    public int calcular(int a, int b, String operador) {
        switch (operador) {
            case "+":
                return somar(a, b);
            case "-":
                return subtrair(a, b);
            case "*":
                return multiplicar(a, b);
            case "/":
                return dividir(a, b);
            default:
                throw new IllegalArgumentException("Operador inválido: " + operador);
        }
    }
}