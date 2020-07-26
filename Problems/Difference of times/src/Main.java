import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] first = new Integer[3];
        Integer[] second = new Integer[3];
        for (int i = 0; i < 3; i++) {
            first[i] = scanner.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            second[i] = scanner.nextInt();
        }

        System.out.println(second[2] - first[2] +
                (second[1] - first[1]) * 60 +
                (second[0] - first[0]) * 3600);
    }
}