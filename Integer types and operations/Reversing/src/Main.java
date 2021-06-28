import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int a = (x / 1) % 10;
        int b = (x / 10) % 10;
        int c = (x / 100) % 10;
        int d = a * 100 + b * 10 + c;
        System.out.println(d);
    }
}
