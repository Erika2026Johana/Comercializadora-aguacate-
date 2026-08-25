import java.util.Scanner;

public class CalcularEdad {

    public static void main(String[] args) {

       try (Scanner teclado = new Scanner (System.in)) {
        
        String nombre;
        int fechaNacimiento;
        int edad;

        System.out.println("== Bienvenido, aquí podrás calcular tu edad ==\n");
        System.out.print("Ingrese su nombre: ");
        nombre = teclado.nextLine();
        System.out.print("Ingrese su año de nacimiento: ");
        fechaNacimiento = teclado.nextInt();
        edad = 2026 - fechaNacimiento;
        System.out.println("\n== Resumen de la Edad ==");
        System.out.println("Nombre: " + nombre);
        System.out.println("Año de nacimiento: " + fechaNacimiento);
        System.out.println("Edad: " + edad);
        teclado.close();




    }

}  

}