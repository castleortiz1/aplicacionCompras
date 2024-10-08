// AplicacionDeCompraConTarjetaDeCredito.java
import com.aluracursos.aplicacioncompras.modelo.TarjetaDeCredito;

import java.util.Scanner;

public class AplicacionDeCompraConTarjetaDeCredito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escriba el límite de la tarjeta: ");
        double cardLimit = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        TarjetaDeCredito creditCard = new TarjetaDeCredito(cardLimit);

        while (true) {
            System.out.print("Escriba la descripción de la compra: ");
            String description = scanner.nextLine();

            System.out.print("Escriba el valor de la compra: ");
            double value = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            if (creditCard.makePurchase(description, value)) {
                System.out.println("Compra realizada!");
            } else {
                System.out.println("Saldo insuficiente!");
            }

            System.out.print("Escriba 0 para salir o 1 para continuar: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 0) {
                break;
            }
        }

        creditCard.displayPurchases(); // Corregido: se llama al método de la instancia
        System.out.printf("Saldo de la tarjeta: %.1f%n", creditCard.getBalance());

        scanner.close(); // Cerrar el scanner
    }
}