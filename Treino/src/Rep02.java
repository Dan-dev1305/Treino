/*Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha
igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as
informações. */
import java.util.Scanner;
public class Rep02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Informando as entradas
        System.out.println("Informe o login do usuário");
        String login = entrada.next();
        System.out.println("Informe a senha deste usuário");
        String senha = entrada.next();
        //Comparando a string do login com a senha ignorando o camel case
        while (login.equalsIgnoreCase(senha)) {
            //Solicitando a revalidação da senha
            System.out.println("A senha não pode ser igual ao usuário. Digite novamente");
            senha = entrada.next();
        }
        System.out.println("Senha válida");
        entrada.close();
        
    }
    
}
