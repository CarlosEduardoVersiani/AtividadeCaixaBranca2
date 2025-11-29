package calculadora;

/**
 * Classe de teste para a CalculadoraRefatorada.
 * 
 * Esta classe contém o método main que executa uma série de testes
 * para validar o comportamento da classe CalculadoraRefatorada, cobrindo
 * tanto os cenários de sucesso quanto os de erro (exceções).
 */
public class TesteCalculadoraRefatorada {

    /**
     * Ponto de entrada principal para a execução dos testes.
     * 
     * @param args Argumentos da linha de comando (não utilizados neste caso).
     */
    public static void main(String[] args) {
        // Cria uma instância da classe CalculadoraRefatorada para poder chamar seus métodos.
        CalculadoraRefatorada calc = new CalculadoraRefatorada();

        // --- TESTES DE OPERAÇÕES BÁSICAS ---
        // O resultado de cada operação é impresso diretamente no console.

        // Testa a operação de SOMA. Esperado: 5
        System.out.println("Resultado da Soma (2+3): " + calc.calcular(2, 3, "+"));

        // Testa a operação de SUBTRAÇÃO. Esperado: 6
        System.out.println("Resultado da Subtração (10-4): " + calc.calcular(10, 4, "-"));

        // Testa a operação de MULTIPLICAÇÃO. Esperado: 15
        System.out.println("Resultado da Multiplicação (3*5): " + calc.calcular(3, 5, "*"));

        // Testa a operação de DIVISÃO. Esperado: 4
        System.out.println("Resultado da Divisão (8/2): " + calc.calcular(8, 2, "/"));
        
        // --- TESTES DE EXCEÇÃO ---
        // Estes blocos `try-catch` são usados para verificar se a calculadora
        // lida corretamente com situações de erro, lançando as exceções esperadas.

        // Testa a DIVISÃO POR ZERO.
        // O código dentro do `try` deve lançar uma `IllegalArgumentException`.
        try {
            System.out.println("Testando divisão por zero (8/0)...");
            calc.calcular(8, 0, "/"); // Esta linha deve causar uma exceção.
        } catch (IllegalArgumentException e) {
            // Se a exceção for capturada, o teste é considerado um sucesso.
            // Imprime a mensagem de erro da exceção para verificação.
            System.out.println("SUCESSO: Exceção de divisão por zero capturada. Mensagem: " + e.getMessage());
        }
        
        // Testa um OPERADOR INVÁLIDO.
        // O código dentro do `try` deve lançar uma `IllegalArgumentException`.
        try {
            System.out.println("Testando operador inválido (5x5)...");
            calc.calcular(5, 5, "x"); // Esta linha deve causar uma exceção.
        } catch (IllegalArgumentException e) {
            // Se a exceção for capturada, o teste é considerado um sucesso.
            // Imprime a mensagem de erro da exceção para verificação.
            System.out.println("SUCESSO: Exceção de operador inválido capturada. Mensagem: " + e.getMessage());
        }
    }
}
