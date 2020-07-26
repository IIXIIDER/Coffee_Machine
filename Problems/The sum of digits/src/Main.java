import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numb = scanner.nextInt();
        System.out.println( numb % 10 +
                numb / 10 % 10 +
                numb / 100 );
    }
}