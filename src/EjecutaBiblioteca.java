
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EjecutaBiblioteca {
    
    ArrayList<Carreras> listaCarreras = new ArrayList<Carreras>();
    ArrayList<Libro> listaLibro = new ArrayList<Libro>();
    ArrayList<AudioVisuales> listaAV = new ArrayList<AudioVisuales>();
    static Carreras carrera1 =new Carreras("Ingenieria en Tecnolias de la Informacion","Ernesto Salvador",10);
    static Carreras carrera2 =new Carreras("Economia","Diana Checa",8);
    static Carreras carrera3 =new Carreras("Licenciatura en Educacion Inicial","Diego Cornejo",8);
    static Carreras carrera4 =new Carreras("Licenciatura en Contabilidad y Auditoria","Santiago Icaza",8);
    static Carreras carrera5 =new Carreras("Ingenieria Electronica","Jorge Naranjo",10);
        
                
       /* 
        ArrayList<Libro> listaLibro = new ArrayList<Libro>();
        listaLibro.add(new Libro("Español", "Matematica",1,"Calculo"));
        listaLibro.add(new Libro("Español","Sistemas",2,"Linux"));
        listaLibro.add(new Libro("Español","Sistemas",3,"JAVA"));
        listaLibro.add(new Libro("Español","Fisica",2,"Teoria electromagnetica"));
        listaLibro.add(new Libro("Español","Quimica",2,"Quimica Organica"));
        
        ArrayList<AudioVisuales> listaAV = new ArrayList<AudioVisuales>();
        listaAV.add(new AudioVisuales(2,6,"Documental 'La Naturaleza'"));*/
    
    public static void menu(){
        ArrayList<Estudiante> estudiante = new ArrayList();
        Scanner entrada = new Scanner(System.in);
        int opcion;
        
        do{
            System.out.println("..*MENU*..");
            System.out.println("1. Ingrese un alumno a una carrera");
            System.out.println("2. Crear un prestamo");
            System.out.println("3. Reportes por estudiante");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opcion: ");        
            opcion=entrada.nextInt();
            switch(opcion){
                case 1:
                    String cedula;
                    boolean validar;
                    String nombre, genero;
                    entrada.nextLine();
                    System.out.print("Ingrese un numero de cédula del estudiante nuevo: ");
                    cedula = entrada.nextLine();
                    System.out.print("Ingrese el nombre del estudiante: ");
                    nombre=entrada.nextLine();
                    System.out.print("Ingrese el genero del estudiante: ");
                    genero=entrada.nextLine();
                    Estudiante est = new Estudiante(cedula,nombre,genero);
                    ArrayList<Estudiante> listaEstudiante = new ArrayList();
                    validar=est.validarCedula(cedula);
                    listaEstudiante.add(est);
        
                    if(validar){
                        System.out.println("La cedula es valida");
                        
                        
                        for(Estudiante a: listaEstudiante){
                            System.out.println(a.getNombre()+" "+a.getCedula()+" "+a.getGenero());
                        }
                    }else{
                    System.out.println("El numero cedula no es valido");
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
    
    public static void addEstudiante(String carrera, Estudiante alumno){
        Scanner entrada = new Scanner(System.in);
        ArrayList<Estudiante> listaEstudiante =new ArrayList<Estudiante>();
        
    }
    
    public static void main(String[] args) {
        
        /*aqui estaba originalmente, pero para poder usar, se instancia como globales
        ArrayList<Libro> listaLibro = new ArrayList<Libro>();
        listaLibro.add(new Libro("Español", "Matematica",1,"Calculo"));
        listaLibro.add(new Libro("Español","Sistemas",2,"Linux"));
        listaLibro.add(new Libro("Español","Sistemas",3,"JAVA"));
        listaLibro.add(new Libro("Español","Fisica",2,"Teoria electromagnetica"));
        listaLibro.add(new Libro("Español","Quimica",2,"Quimica Organica"));
        
        ArrayList<AudioVisuales> listaAV = new ArrayList<AudioVisuales>();
        listaAV.add(new AudioVisuales(2,6,"Documental 'La Naturaleza'"));*/
        
        menu();
    }
    
}
