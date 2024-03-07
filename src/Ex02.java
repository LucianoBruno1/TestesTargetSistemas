import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numeros = new int[30];
        int atual = 0;
        int anterior = 1;
        int memoria;
        boolean fazParte = false;

        try {
            System.out.print("Digite um número para saber se ele está presente numa sequência fibonacci de 30 números: ");
            int valor = input.nextInt();

            for (int i = 0; i <30 ; i++) {
                numeros[i] = atual;
                System.out.println(numeros[i]);
                memoria = atual;
                atual += anterior;
                anterior = memoria;

                if (numeros[i] == valor){
                    System.out.println("↑=====BEM AQUI=======↑");
                    fazParte = true;
                }
            }
            if(fazParte == true){
                System.out.println("\nFAZ PARTE");
            }else{
                System.out.println("\nNÃO FAZ PARTE");
            }
        }catch (InputMismatchException e1){
            System.out.println("Digite apenas números.");
        }
    }
}