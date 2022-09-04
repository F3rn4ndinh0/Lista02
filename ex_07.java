import java.util.Scanner;

public class ex_07 {

    public static void main(String[] args) {

        Scanner media = new Scanner(System.in);

        int i = 1;
        int soma = 0;
        double total = 0;

        while (i <= 10) {
            System.out.println("Me informe um número: ");
            int numero = media.nextInt();


            if(numero % 3 == 0){
                soma += numero;
                total++;
            }
            i++;
            }
        total = soma / total;
        System.out.println("A média dos números múltiplos de 3 é igual a " + total);
        }

    }