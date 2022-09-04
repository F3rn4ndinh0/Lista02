import java.util.Scanner;

public class ex_04 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Me informe um número para calcular os 20 primeiros múltiplos: ");
        int numero = entrada.nextInt();


        for(int i = 0; i <= 20; i++){
            int resultado = numero * i; 
            System.out.println(resultado);

        }


        
    }

}