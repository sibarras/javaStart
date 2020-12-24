import java.util.Scanner;

public class TypeCastingAndInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String scanned = sc.next();
        // esto es para enteros
        System.out.println(scanned);

        // Para recoger tipos enteros
        int scannedInt = sc.nextInt();
        System.out.println(scannedInt);

        // asi con todos los otros tipos.
        //  Para evitar problemas puedes recibirlo todo
        //  como string y luego convertirlo a lo que quieras.
        int x = Integer.parseInt(scanned);
        boolean cond = Boolean.parseBoolean(scanned);
        double xdouble = Double.parseDouble(scanned);
        // Tienes que usar condiciones para evitar errores de entrada.


        // You have to close it at the end
        sc.close();
    }
}
