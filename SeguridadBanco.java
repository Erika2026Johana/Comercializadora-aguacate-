import java.util.Scanner;

public class SeguridadBanco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


    String Aprobado = "Transacción Aprobada";
    String Revisar = "Transacción en revisión";
    String Bloquear = "Transacción bloqueada";

    System.out.println("Ingrese el monto de la transacción: ");
    double montoTransaccion = scanner.nextDouble();

     if (montoTransaccion < 100000) {
        System.out.println(Aprobado);
    } else if (montoTransaccion >= 100000 && montoTransaccion <= 500000) {
        System.out.println(Revisar);
    } else {
        System.out.println(Bloquear);

    scanner.close();


    }
}

}