import java.util.Scanner;

public class Senha {

    public static void main(String[] args) {

        Scanner senha = new Scanner(System.in);
        String pass = senha.next();
        int contaSenha = pass.length();

        //Verifica o tamanho da senha

        if(contaSenha < 6){
            contaSenha = 6 - contaSenha;
            System.out.println(contaSenha);
        }

        //Verifica se há números na senha informada

        String [] verificaNumeros = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        boolean numeros = false;

        for(int i = 0; i < verificaNumeros.length; i++) {
            if(pass.contains(verificaNumeros[i])) {
                numeros = true;
                break;
            }
        }

        //Verifica se há caracteres especiais

        String [] verificaCaracteres = {"!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "+"};
        boolean caracter = false;

        for(int i = 0; i < verificaCaracteres.length; i++){
            if(pass.contains(verificaCaracteres[i])){
                caracter = true;
                break;
            }
        }

        //Verifica se digitou alguma letra maiúscula

        String [] verificaMaiuscula = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        boolean maiuscula = false;

        for(int i = 0; i < verificaMaiuscula.length; i++){
            if(pass.contains(verificaMaiuscula[i])){
                maiuscula = true;
                break;
            }
        }

        //Verifica se digitou alguma letra minúscula

        String [] verificaMinusculas = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j" , "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        boolean minuscula = false;

        for(int i = 0; i < verificaMinusculas.length; i++){
            if(pass.contains(verificaMinusculas[i])){
                minuscula = true;
                break;
            }
        }

    }
}
