import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int h1 = scanner.nextInt() * 3600;
        int m1 = scanner.nextInt() * 60;
        int s1 = scanner.nextInt();
        int h2 = scanner.nextInt() * 3600;
        int m2 = scanner.nextInt() * 60;
        int s2 = scanner.nextInt();
        int time1 = h1 + m1 + s1;
        int time2 = h2 + m2 + s2;
        System.out.println(time2 - time1);
    }
}
