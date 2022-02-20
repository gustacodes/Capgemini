import java.util.*;

public class Asterisco {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int espacos = n - 1;
        int asterisco = 1;

        while(n > 0){
            for(int i = espacos; i > 0 ; i--){
                System.out.print(" ");
            }
                for(int i = 0; i < asterisco; i++){
                    System.out.print("*");
                }

                System.out.println("");
            n--;
            espacos--;
            asterisco++;
        }
    }

}
