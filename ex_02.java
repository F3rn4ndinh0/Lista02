import java.util.Scanner;

public class ex_02 {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número entre 0 a 100: ");
        int numero = entrada.nextInt();

        int resultado = numero % 2;

        if(resultado == 0 ){
            System.out.println("O número é PAR.");
        }else{
            System.out.println("O número é IMPAR.");
        }
    }

}