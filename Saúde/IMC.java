import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem Vindo(a) ao IMC SYSTEM ");
        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();
        
        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();
        
        double IMC = peso / (altura * altura);
        IMC = Math.round(IMC * 100.00) / 100.00;
        
        if (IMC < 18) {
            System.out.println("Voce está abaixo do peso");
        } else if (IMC >= 18) {
            System.out.println("Voce está no peso ideal");
        } else if (IMC >= 19) {
            System.out.println("Voce está cima do peso ideal");
        } else {
            System.out.println("Erro, tente outros valores");
        }
    }
}