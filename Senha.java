import java.util.Scanner;

public class Senha {

    public static void main(String[] args) {

        Scanner senha = new Scanner(System.in);
        String pass = senha.next();
        int contaSenha = pass.length();

        //Verifica o tamanho da senha

        if(contaSenha < 6){
            System.out.println("A senha deve conter mais de 6 caracteres.");
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

        if(numeros == false){
            System.out.println("Digite pelo menos um numero.");
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

        if(caracter == false){
            System.out.println("Digite pelo menos um dos caracteres especiais: !@#$%^&*()-+");
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

        if(maiuscula == false){
            System.out.println("Digite pelo menos uma letra maiúscula");
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

        if(minuscula == false){
            System.out.println("Digite pelo menos uma letra minúscula");
        }

        if(numeros == true && caracter == true && maiuscula == true && minuscula == true && contaSenha > 6){
            System.out.println("Senha cadastrada!");
        }

    }
}
