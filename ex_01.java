import java.util.Scanner;

public class ex_01 {

        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            System.out.println("Digite um número que estreja entre 0 a 500: ");
            double num = entrada.nextDouble();

            if(num >= 100 && num <= 200){
                System.out.println("Você digitou um número entre 100 e 200!");
            }else{
                System.out.println("Você digitou um número fora da faixa!");
            }
        }
    }

