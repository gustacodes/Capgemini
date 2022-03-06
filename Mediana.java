import java.util.Arrays;

public class Mediana {

    public static void main(String[] args) {
        int [] m = {7, 3, 4, 6, 5};

            for(int i = 0 ; i < 5; i++){
                Arrays.sort(m);
            }
                System.out.println(m[2]);
    }
}
