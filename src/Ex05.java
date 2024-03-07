
import java.util.Scanner;
public class Ex05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite um texto para que ele seja invertido: ");
        String txt = input.nextLine();
        String stringInvertida = "";

        for (int i = txt.length()-1 ; i >= 0 ; i--) {
            stringInvertida += Character.toString(txt.charAt(i));
        }
        System.out.println(stringInvertida);
    }
}