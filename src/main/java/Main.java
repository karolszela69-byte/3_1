import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj wysokość choinki: ");
        int wysokosc = scanner.nextInt();

        for (int i = 0; i < wysokosc; i++) {
            for (int j = 0; j < wysokosc - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i + 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < wysokosc - 1; i++){
            System.out.print(" ");
        }
        System.out.println("*");

        scanner.close();
    }
}

            
        
                