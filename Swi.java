import java.util.Scanner;

public class Swi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número del 1 al 5: ");
        int numero = scanner.nextInt();
        
        switch (numero) {
            case 1:
                System.out.println("Seleccionaste el número 1.");
                break;
            case 2:
                System.out.println("Seleccionaste el número 2.");
                break;
            case 3:
                System.out.println("Seleccionaste el número 3.");
                break;
            case 4:
                System.out.println("Seleccionaste el número 4.");
                break;
            case 5:
                System.out.println("Seleccionaste el número 5.");
                break;
            default:
                System.out.println("Número fuera de rango. Debes ingresar un número del 1 al 5.");
                break;
        }
        
        scanner.close();
    }
}
