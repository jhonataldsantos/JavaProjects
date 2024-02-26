import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) throws Exception {
        System.out.println("*-- Tiro Certo --*");
        Scanner input = new Scanner(System.in);
        menu(input);
        input.close();
    }

    /*
     * MÉTODO: menu
     * Nesse método, é feita algumas validações para o usuário escolher entre jogar
     * e sair, além de escolher a dificuldade e o intervalo!
     */
    public static void menu(Scanner input) {
        System.out.println("Bem - vindo ao Tiro Certo.");
        int escolha = 0, dificuldade = 0, intervalo = 0;
        while (escolha < 1 || escolha > 2) {
            System.out.println("1 - Jogar\n2- Sair");
            escolha = input.nextInt();
            if (escolha < 1 || escolha > 2)
                System.out.println("Por favor, escolha um número entre 1 e 2.");
        }
        if (escolha == 1) {
            System.out.println("Ótimo, vamos jogar então!");
            System.out.println(
                    "Primeiro, selecione a dificuldade, e em seguida o número de intervalo\nOBS: O número de intervalo é onde será o limite. Por exemplo: Usuário escolhe 30 -> Intervalo que o número será escolhido: 0-30.");
            System.out.println(
                    "A dificuldade pode ser: 1 - Fácil; 2 - Médio; 3 - Difícil; 4 - Extremo.\nNo fácil o usuário terá 10 chances, no médio 5 chances, difícil 3 chances, e no extremo apenas 1 chance de adivinhar.");
            System.out.print("Dificuldade: ");
            while (dificuldade < 1 || dificuldade > 4) {
                dificuldade = input.nextInt();
                if (dificuldade < 1 || dificuldade > 4)
                    System.out.println("Por favor, selecione uma dificuldade correta.");
            }
            System.out.print("Intervalo: ");
            while (intervalo <= 0) {
                intervalo = input.nextInt();
                if (intervalo <= 0)
                    System.out.println("O intervalo não pode ser zero ou negativo.");
            }
            redirecionaDificuldade(dificuldade, intervalo, input);
        } else {
            System.out.println("FIM DE JOGO!");
        }
    }

    /*
     * MÉTODO: redirecionaDificuldade
     * Esse método apenas redireciona a dificuldade para cada modo de jogo possível.
     */
    public static void redirecionaDificuldade(int dificuldade, int intervalo, Scanner input) {
        if (dificuldade == 1) {
            System.out.println("A dificuldade selecionada foi a fácil.");
            nivelFacil(intervalo, input);
        } else if (dificuldade == 2) {
            System.out.println("A dificuldade selecionada foi a média.");
            nivelMedio(intervalo, input);
        } else if (dificuldade == 3) {
            System.out.println("A dificuldade selecionada foi a difícil.");
            nivelDificil(intervalo, input);
        } else if (dificuldade == 4) {
            System.out.println("A dificuldade selecionada foi a extrema.");
            nivelExtremo(intervalo, input);
        }
    }

    /*
     * MÉTODO: nivelFacil
     * Esse método retorna o modo de jogo no nivelFacil, onde o usuário tem 10
     * chances para adivinhar o número gerado pela máquina. Se não adivinhar, o jogo
     * acaba.
     */
    public static void nivelFacil(int intervalo, Scanner input) {
        Random gerador = new Random();
        int numeroGerado = gerador.nextInt(intervalo + 1);
        int contador = 10;
        do {
            System.out.println("Digite um número: ");
            int numeroInput = input.nextInt();
            if (numeroInput == numeroGerado) {
                System.out.println("Você acertou, é o número " + numeroGerado + ".");
                System.out.println("Fim de jogo.");
                menu(input);
            } else {
                System.out.println("Você errou!");
                verificaFrioQuente(numeroGerado, numeroInput);
            }
            contador--;
            if (contador == 0 && numeroGerado != numeroInput) {
                System.out.println("Você perdeu, o jogo acabou!");
                System.out.println("O número gerado era o número: " + numeroGerado);
                menu(input);
            }
        } while (contador >= 1);
    }

    /*
     * MÉTODO: nivelMedio
     * Esse método retorna o modo de jogo no nivelMedio, onde o usuário tem 5
     * chances para adivinhar o número gerado pela máquina. Se não adivinhar, o jogo
     * acaba.
     */
    public static void nivelMedio(int intervalo, Scanner input) {
        Random gerador = new Random();
        int numeroGerado = gerador.nextInt(intervalo + 1);
        int contador = 5;
        do {
            System.out.println("Digite um número: ");
            int numeroInput = input.nextInt();
            if (numeroInput == numeroGerado) {
                System.out.println("Você acertou, é o número " + numeroGerado + ".");
                System.out.println("Fim de jogo.");
                menu(input);
            } else {
                System.out.println("Você errou!");
                verificaFrioQuente(numeroGerado, numeroInput);
            }
            contador--;
            if (contador == 0 && numeroGerado != numeroInput) {
                System.out.println("Você perdeu, o jogo acabou!");
                System.out.println("O número gerado era o número: " + numeroGerado);
                menu(input);
            }
        } while (contador >= 1);
    }

    /*
     * MÉTODO: nivelDificil
     * Esse método retorna o modo de jogo no nivelDificil, onde o usuário tem 10
     * chances para adivinhar o número gerado pela máquina. Se não adivinhar, o jogo
     * acaba.
     */
    public static void nivelDificil(int intervalo, Scanner input) {
        Random gerador = new Random();
        int numeroGerado = gerador.nextInt(intervalo + 1);
        int contador = 3;
        do {
            System.out.println("Digite um número: ");
            int numeroInput = input.nextInt();
            if (numeroInput == numeroGerado) {
                System.out.println("Você acertou, é o número " + numeroGerado + ".");
                System.out.println("Fim de jogo.");
                menu(input);
            } else {
                System.out.println("Você errou!");
                verificaFrioQuente(numeroGerado, numeroInput);
            }
            contador--;
            if (contador == 0 && numeroGerado != numeroInput) {
                System.out.println("Você perdeu, o jogo acabou!");
                System.out.println("O número gerado era o número: " + numeroGerado);
                menu(input);
            }
        } while (contador >= 1);
    }

    /*
     * MÉTODO: nivelExtremo
     * Esse método retorna o modo de jogo no nivelExtremo, onde o usuário tem 10
     * chances para adivinhar o número gerado pela máquina. Se não adivinhar, o jogo
     * acaba.
     */
    public static void nivelExtremo(int intervalo, Scanner input) {
        Random gerador = new Random();
        int numeroGerado = gerador.nextInt(intervalo + 1);
        int contador = 1;
        do {
            System.out.println("Digite um número: ");
            int numeroInput = input.nextInt();
            if (numeroInput == numeroGerado) {
                System.out.println("Você acertou, é o número " + numeroGerado + ".");
                System.out.println("Fim de jogo.");
                menu(input);
            } else {
                System.out.println("Você errou!");
                verificaFrioQuente(numeroGerado, numeroInput);
            }
            contador--;
            if (contador == 0 && numeroGerado != numeroInput) {
                System.out.println("Você perdeu, o jogo acabou!");
                System.out.println("O número gerado era o número: " + numeroGerado);
                menu(input);
            }
        } while (contador > 1);
    }

    /*
     * MÉTODO: verificaFrioQuente
     * Esse método verifica se a pessoa está perto ou longe de acertar. Até 3 >
     * Apelando, Até 7 > Quente, Até 13 > Morno, e qualquer outro intervalo, está
     * frio.
     */
    public static void verificaFrioQuente(int numeroGerado, int numeroInput) {
        int numeroSaldo = numeroGerado - numeroInput;
        if (numeroSaldo < 0)
            numeroSaldo *= -1;
        if (numeroSaldo >= 0 && numeroSaldo <= 3) {
            System.out.println("Está apelando!");
        } else if (numeroSaldo >= 0 && numeroSaldo <= 7) {
            System.out.println("Está quente!");
        } else if (numeroSaldo >= 0 && numeroSaldo <= 13) {
            System.out.println("Está morno!");
        } else {
            System.out.println("Está frio!");
        }
    }
}