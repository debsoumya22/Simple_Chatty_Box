//put imports you need here
import java.util.Scanner; 

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        sc.next();
        sc.next();
        sc.next();
        String word5 = sc.next();
        
        System.out.print("The form for " + word1 + " is completed. ");
        System.out.println("We will contact you if we need a chef that cooks " + word5 + " dishes.");
    }
}
