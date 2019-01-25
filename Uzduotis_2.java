import java.util.Scanner;
public class Uzduotis_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String varduMasyvas[] = new String[10];


        for (int i = 0; i < 10; i++) {
            System.out.println("Iveskite varda: ");
            String vardas = input.next();
            varduMasyvas[i] = vardas;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(varduMasyvas[i].toUpperCase() + "-" + varduMasyvas[i].length() + "-" + i);
        }
    }
}
