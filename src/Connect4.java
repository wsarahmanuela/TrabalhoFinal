import java.util.Scanner;

public class Connect4 {

    public void tabuleiroBranco(char[][] tabuleiro) {
        for (int linha = 0; linha < 6; linha++) {
            for (int colunas = 0; colunas < 7; colunas++) {
                tabuleiro[linha][colunas] = 'B';
            }
        }
    }

    public void ImprimirTabuleiro(char[][] tabuleiro) {
        for (int linha = 0; linha < 6; linha++) {
            for (int colunas = 0; colunas < 7; colunas++) {
                System.out.print(tabuleiro[linha][colunas] + " ");
            }

            System.out.println();
        }
        System.out.println("1 2 3 4 5 6 7");
    }

    public void escolherCor(){
        System.out.println("Escolha sua cor!");
        System.out.println("1- Vermelho (v): ");
        System.out.println("2 - Azul (a): ");
        char cor = sc.next().charAt(0);

        char corJogador;
        char corComputador;
        if(cor == 'v'){
            corJogador = 'v';
            corComputador = 'a';
            System.out.println("Voce é o vermelhor. Computador é azul");
        } else {
            corJogador = 'a';
            corComputador = 'v';
            System.out.println("Voce é o azul. Computador é vermelho");
        }

    public void adicionarPeca(char cor, char[][] tabuleiro, Scanner sc){
        int coluna;
        ImprimirTabuleiro(tabuleiro);
        System.out.println("Digite a coluna que deseja acrescentar a peça: (1 á 7)");
        coluna = sc.nextInt() -1;

        for (int linha = 5; linha >=0; linha--){
           if (tabuleiro[linha][coluna] == 'B'){
            tabuleiro[linha][coluna] = cor;
            break;
           }
        }
        ImprimirTabuleiro(tabuleiro);
    }

    public Connect4() {
        Scanner sc = new Scanner(System.in);
        char tabuleiro[][] = new char[6][7];

        tabuleiroBranco();
        ImprimirTabuleiro();
        escolherCor();

       char tabuleiro[][] = new char[6][7];


        tabuleiroBranco(tabuleiro); 
        adicionarPeca('v', tabuleiro, sc);
        sc.close();
    }

    public static void main(String[] args) {
        Connect4 connect4 = new Connect4();

    }
}
}
