
import java.util.ArrayList;
import java.util.Scanner;


public class EjecutaBiblioteca {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        /*Carreras listaCarreras[]=new Carreras[5];
        listaCarreras[0]=new Carreras("Ingenieria en Tecnolias de la Informacion","Ernesto Salvador",10);
        listaCarreras[1]=new Carreras("Economia","Diana Checa",8);
        listaCarreras[2]=new Carreras("Licenciatura en Educacion Inicial","Diego Cornejo",8);
        listaCarreras[3]=new Carreras("Licenciatura en Idiomas","Santiago Icaza",8);
        listaCarreras[4]=new Carreras("Turismo","Jorge Naranjo",10);*/
        
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
