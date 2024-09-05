public class Calculadora {
    public static int somarPositivos(int n1, int n2) throws Exception {

        // regra para lancar a exceção
        if (n1 < 0 | n2 < 0) {

            // Se a condição for verdadeira a execução abaixo é lançado
            throw new Exception("Os Valores devem ser positivos.");
            // Quando uma exceção e lançada o metodo e finalizado
        }

        // Se não tem nenhuma exceção lançada ele retorna a soma dos valores
        return n1 + n2;

    }

}
