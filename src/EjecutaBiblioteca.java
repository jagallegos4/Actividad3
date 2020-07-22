
import java.util.Scanner;


public class EjecutaBiblioteca {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        menu();
    }
    
    public static void menu(){
        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println("..*MENU*..");
        System.out.println("1. Ingrese un alumno de una carrera");
        System.out.println("2. Crear un prestamo");
        System.out.println("3. Reportes por estudiante");
        System.out.println("4. Salir");
        System.out.print("Ingrese una opcion: ");        
        opcion=entrada.nextInt();
        do{
            switch(opcion){
                case 1:
                    
                    break;                    
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    System.out.println("SALISTE DEL MENU\nGRACIAS");
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
                break;
            }
        }while(opcion!=4);
    }
}
