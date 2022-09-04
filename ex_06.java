import java.util.Scanner;

public class ex_06 {

    public static void main(String[] args) {

        Scanner raiz = new Scanner(System.in);

        int i = 0;

        while(i < 10){
            System.out.printf("Me informe um número:");
            double numero = raiz.nextDouble();
            System.out.printf("A raiz quadrada de " + numero + " é igual a " + Math.sqrt(numero) + "\n");
            i += 1;
        }



    }
}

    
