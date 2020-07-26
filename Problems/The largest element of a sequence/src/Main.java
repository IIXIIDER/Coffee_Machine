import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int input;
        do {
            input = scanner.nextInt();
            if (input > max)
                max = input;
        } while (input!=0);
        System.out.println(max);
    }
}