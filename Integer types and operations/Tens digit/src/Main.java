import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int ones = num / 10;
        int tens = ones % 10;
        System.out.println(tens);


    }
}