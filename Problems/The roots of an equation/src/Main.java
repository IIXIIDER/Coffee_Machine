import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] coefficient = new int[4];
        for (int i = 0; i < 4; i++) {
            coefficient[i] = scanner.nextInt();
        }
        int roots = 0;
        for (int i = 0; i < 1_000; i++) {
            if (coefficient[0] * i * i * i +
                    coefficient[1] * i * i +
                    coefficient[2] * i +
                    coefficient[3] == 0) {
                System.out.println(i);
                roots++;
            }
            if (roots == 3) {
                i = 1000;
            }
        }
    }
}