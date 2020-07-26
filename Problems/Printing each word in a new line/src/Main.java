import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {
            words[i] = scanner.next();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(words[i]);
        }
    }
}