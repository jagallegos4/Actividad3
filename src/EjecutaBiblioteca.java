
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EjecutaBiblioteca {
    
    public static void menu(){
        ArrayList<Estudiante> estudiante = new ArrayList();
        Scanner entrada = new Scanner(System.in);
        int opcion;
        
        do{
            System.out.println("..*MENU*..");
            System.out.println("1. Ingrese un alumno de una carrera");
            System.out.println("2. Crear un prestamo");
            System.out.println("3. Reportes por estudiante");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opcion: ");        
            opcion=entrada.nextInt();
            switch(opcion){
                case 1:
                    String cedula;
                    boolean validar;
                    entrada.nextLine();
                    System.out.print("Ingrese un numero de cédula del estudiante nuevo: ");
                    cedula = entrada.nextLine();
                    Estudiante est = new Estudiante(cedula,"juan","masculino");
                    List<Estudiante> estud = new ArrayList<Estudiante>();
                    validar=est.validarCedula(cedula);
        
                    if(validar){
                        System.out.println("La cedula es valida");
                    }else{
                    System.out.println("La cedula no es valida");
                    }
                    break;                    
                case 2:
                    System.out.print("Ingrese el numero de cedula del estudiante a"
                            + "asignar el material: ");
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
    
    public static void llenarE(Estudiante[] estud){
        Scanner sc = new Scanner(System.in);
        String nom, cc, gen;
        for(int i=0; i<estud.length;i++){
            System.out.println("Nombre Estudiante No "+(i+1));
            nom = sc.nextLine();
            System.out.println("Cedula Estudiante No "+(i+1));
            cc = sc.nextLine();
            System.out.println("Estudiante No "+(i+1));
            gen= sc.nextLine();
            estud[i] =  new Estudiante(cc,nom,gen);
            //limpia el buffer
            sc.nextLine();
        }  
    } 
    
    public static void main(String[] args) {
        
        
        /*Carreras listaCarreras[]=new Carreras[5];
        listaCarreras[0]=new Carreras("Ingenieria en Tecnolias de la Informacion","Ernesto Salvador",10);
        listaCarreras[1]=new Carreras("Economia","Diana Checa",8);
        listaCarreras[2]=new Carreras("Licenciatura en Educacion Inicial","Diego Cornejo",8);
        listaCarreras[3]=new Carreras("Licenciatura en Idiomas","Santiago Icaza",8);
        listaCarreras[4]=new Carreras("Turismo","Jorge Naranjo",10);*/
        
        menu();
    }
    
}
