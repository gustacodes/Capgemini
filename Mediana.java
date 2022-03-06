import java.util.Arrays;

public class Mediana {

    public static void main(String[] args) {
        int [] m = {9, 2, 1, 4, 6};

            for(int i = 0 ; i < m.length; i++){
                Arrays.sort(m);
            }

                System.out.println(m[2]);
    }
}
