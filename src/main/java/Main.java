import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guests = scanner.nextInt();
        if(guests > 1) {
            if (guests % 2 == 1) {
                System.out.println(guests);
            }
        }
        if(guests % 2 == 0){
            System.out.println(guests / 2);
        }
        if(guests == 1){
            System.out.println(0);
        }
    }
}
