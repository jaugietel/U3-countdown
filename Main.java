import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
            if (i == 1) {
                System.out.println("BOOM!!!");
            }
        }
    }
}

