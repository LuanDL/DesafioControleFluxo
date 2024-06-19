
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmentro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo Parâmetro: ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception ) {
            System.err.println("O segundo parâmetro deve ser maior que o primeiro!");
        }

        terminal.close();

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }

        for (int i = 1; i <= parametroDois - parametroUm; i++) {
            System.out.println(i);
        }
    }
}

class ParametrosInvalidosException extends Exception{
    public ParametrosInvalidosException(){
        super("O segundo parâmetro deve ser maior que o primeiro!");
    }
}