import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int solution = 0;
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int temp = scanner.nextInt();
            if ((solution < temp) && (temp % 4 == 0))
                solution = temp;
        }
        System.out.println(solution);
    }
}