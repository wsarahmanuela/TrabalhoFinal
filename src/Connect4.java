import java.util.Scanner;

public class Connect4 {

    Scanner sc = new Scanner(System.in);

    char tabuleiro[][] = new char[6][7];

    public void tabuleiroBranco() {
        for (int linha = 0; linha < 6; linha++) {
            for (int colunas = 0; colunas < 7; colunas++) {
                tabuleiro[linha][colunas] = 'B';
            }
        }
    }

    public void ImprimirTabuleiro() {
        for (int linha = 0; linha < 6; linha++) {
            for (int colunas = 0; colunas < 7; colunas++) {
                System.out.print(tabuleiro[linha][colunas] + " ");
            }

            System.out.println();
        }
        System.out.println("1 2 3 4 5 6 7");
    }

    public Connect4() {
        Scanner sc = new Scanner(System.in);
        char tabuleiro[][] = new char[6][7];

        tabuleiroBranco();
        ImprimirTabuleiro();

    }

    public static void main(String[] args) {
        Connect4 connect4 = new Connect4();

    }
}
