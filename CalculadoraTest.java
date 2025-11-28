package calculadora;

/**
 * Testes unitários para a classe Calculadora.
 */
public class CalculadoraTest {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        // Teste de adição
        assert calc.calc(5, 3, "+") == 8 : "Teste de adição falhou";
        System.out.println("✓ Teste de adição passou: 5 + 3 = 8");
        
        // Teste de subtração
        assert calc.calc(10, 4, "-") == 6 : "Teste de subtração falhou";
        System.out.println("✓ Teste de subtração passou: 10 - 4 = 6");
        
        // Teste de multiplicação
        assert calc.calc(7, 6, "*") == 42 : "Teste de multiplicação falhou";
        System.out.println("✓ Teste de multiplicação passou: 7 * 6 = 42");
        
        // Teste de divisão
        assert calc.calc(20, 4, "/") == 5 : "Teste de divisão falhou";
        System.out.println("✓ Teste de divisão passou: 20 / 4 = 5");
        
        // Teste de divisão por zero
        try {
            calc.calc(10, 0, "/");
            System.out.println("✗ Teste de divisão por zero falhou: exceção não foi lançada");
        } catch (IllegalArgumentException e) {
            System.out.println("✓ Teste de divisão por zero passou: " + e.getMessage());
        }
        
        // Teste de operação inválida
        try {
            calc.calc(5, 3, "%");
            System.out.println("✗ Teste de operação inválida falhou: exceção não foi lançada");
        } catch (IllegalArgumentException e) {
            System.out.println("✓ Teste de operação inválida passou: " + e.getMessage());
        }
        
        System.out.println("\nTodos os testes passaram com sucesso!");
    }
}
