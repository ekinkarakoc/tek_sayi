import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        int n;

        do {
            System.out.println("Sayi giriniz: ");
            n = scanner.nextInt();
            if(n%2 == 1){
                toplam+=n;
            }
        } while (n > 0);
        System.out.println(toplam);
    }
}