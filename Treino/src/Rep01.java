/*Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem
caso o valor seja inválido e continue pedindo até que o usuário informe um valor
válido.*/
import java.util.Scanner;
public class Rep01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Declaração de entrada
        System.out.println("Informe um nota entre zero e dez");
        int nota = entrada.nextInt();
        //Exclusão da nota fora do pedido
        while (nota < 0 || nota > 10) {
            System.out.println("Informe uma nota válida");
            //Solicitação de nova nota para revalidação
            nota = entrada.nextInt();            
        }
        //Informação de nota correta
        System.out.println("Nota informada corretamente");
        entrada.close();
        
    }
    
}
