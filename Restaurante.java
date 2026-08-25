
import java.util.Scanner;
public class Restaurante {

public static void main(String[] args) {

Scanner teclado = new Scanner(System.in);
System.out.print("Ingrese el nombre del cliente: ");
String nombreCliente = teclado.nextLine();

System.out.print("Ingrese el nombre del palto principal");
String platoPrincipal = teclado.nextLine();

System.out.print("Ingrese el nombre de la bebida: ");
String bebida = teclado.nextLine();

System.out.print("Ingrese el precio del plato: ");
double precioplato = teclado.nextDouble();

System.out.print("Ingrese el precio de la bebida: ");
double precioBebida =teclado.nextDouble();

double subtotal = precioplato + precioBebida;
double iva = subtotal * 0.19;       // 19% de IVA
double propina = subtotal * 0.10;   // 10% de propina
double total = subtotal + iva + propina;

System.out.println("======FACTURA DE CONSUMO=====");
System.out.println("Cliente: " + nombreCliente);
System.out.println("Plato " + platoPrincipal + "- $" + precioplato);
System.out.println("bebida " + bebida +" - $"+ precioBebida);
System.out.println("--------------------");
System.out.println("Subtotal:     $" + subtotal);
System.out.println("Subtotal:     $" + subtotal);
System.out.println("IVA (19%):    $" + iva);
System.out.println("propina (10%): $" + propina);
System.out.println("---------------------------");
System.out.println("TOTAL A PAGAR $" + total);
System.out.println("===============================");

teclado.close();





    }
}