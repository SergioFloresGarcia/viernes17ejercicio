import java.util.Scanner;
public class viernes17ejercicio {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese tu nombre");
    String nombre =sc.nextLine();
    System.out.println("Hola " +nombre);
    System.out.println("Introduce un numero:");
    int numero;
    numero = sc.nextInt();

    if(numero<0) {
    System.out.println("El numero ingresado es negativo");

    }else{
    System.out.println("El numero ingresado es positivo");
    }
 }
}
    

    