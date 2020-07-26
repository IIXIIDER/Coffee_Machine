import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long input = scanner.nextLong();
        long fac = 1;
        int i = 1;
        while (fac <= input) {
            i++;
            fac = fac * i;
        }
        System.out.println(i);
    }
}