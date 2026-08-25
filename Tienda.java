
import java.util.Scanner;

public class Tienda {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        {

            String nombreProducto;
            double precio;
            int cantidad;
            double totalcompra;

            System.out.println("=====SISTEMA DE VENTAS=====");

            System.out.print(" Ingressa el nombre del producto: ");
            nombreProducto = teclado.nextLine();

            System.out.print("Ingressa el precio del producto: ");
            precio = teclado.nextDouble();

            System.out.print("Ingrese la cantidad: ");
            cantidad = teclado.nextInt();

            totalcompra = precio * cantidad;

            System.out.println("/n=====Factura=====");
            System.out.println("producto : " + nombreProducto);
            System.out.println("precio : $" + precio);
            System.out.println("cantidad : " + cantidad);
            System.out.println("Total     : $  " + totalcompra);
            System.out.println("================");

            teclado.close();

        }

    }

}