import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class EjecutaBiblioteca {    
       
    public static void addEstudiante(String carrera, Estudiante alumno){
        
    }
    
    public static void main(String[] args) {
        
        ArrayList<Carreras> listaCarreras = new ArrayList<Carreras>();
        ArrayList<Libro> listaLibro = new ArrayList<Libro>();
        ArrayList<AudioVisuales> listaAV = new ArrayList<AudioVisuales>();
        
        listaCarreras.add(new Carreras("Ingenieria en TI","Ernesto Salvador",10));
        listaCarreras.add(new Carreras("Economia","Diana Checa",10));
        listaCarreras.add(new Carreras("Licenciatura en Educacion","Diego Cornejo",8));
        listaCarreras.add(new Carreras("Licenciatura en Contabilidad","Santiago Icaza",8));
        listaCarreras.add(new Carreras("Ingenieria Electronica","Jorge Naranjo",10));
        
        listaLibro.add(new Libro("Español", "Matematica",1,"Calculo"));
        listaLibro.add(new Libro("Español","Sistemas",2,"Linux"));
        listaLibro.add(new Libro("Español","Sistemas",3,"JAVA"));
        listaLibro.add(new Libro("Español","Fisica",4,"Teoria electromagnetica"));
        listaLibro.add(new Libro("Español","Quimica",5,"Quimica Organica"));
        
        listaAV.add(new AudioVisuales("Documental 'La Naturaleza'",2,6));
        listaAV.add(new AudioVisuales("Historia de la Fisica",1,7));
        listaAV.add(new AudioVisuales("Biografia de Albert Einstein",2,8));
        listaAV.add(new AudioVisuales("Documental 'Especies Marinas'",1,9));
        
        Material material =new Material();
        
        material.agregarL(listaLibro);
        material.agregarAV(listaAV);
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
                    String cedula, carrera;
                    boolean validar;
                    String nombre, genero;
                    entrada.nextLine();
                    System.out.print("Ingrese un número de cédula del estudiante nuevo: ");
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
                        
                        System.out.println("La cédula es valida");
                        System.out.print("Ingrese a la carrera a la que pertenece: ");
                        carrera=entrada.nextLine();
                        
                        boolean bandera=false;
                        for(Carreras c: listaCarreras){
                            if(c.getNombreCarrera().equals(carrera)){
                                bandera=true;
                            }
                        }
                        if(bandera){
                            System.out.println("la carrera existe");
                        }else{
                            System.out.println("la carrera no existe");
                        }
                            
                    }   
                    else{
                    System.out.println("El numero cedula no es valido");
                    }
                    break;                    
                case 2:
                    Date fechaActual =new Date();
                    int codigo, opt;
                    System.out.println("Crear un prestamo"
                            + "\nLista de materiales disponible");
                    material.mostrar();
                    System.out.println("1. Para prestar Libro");
                    System.out.println("2. para material audio visual");
                    System.out.print("Escoja una opcion: ");
                    opt=entrada.nextInt();
                    switch(opt){
                        case 1:
                            System.out.println("Ingrese el codigo del libro a prestar: ");
                            codigo=entrada.nextInt();
                            boolean bandera2=false;
                            for(Libro l: listaLibro){
                                if(l.getCodigo()==codigo){
                                    bandera2=true;
                                }                              
                            }
                            if(bandera2){
                                System.out.println("ingrese el numero de cedula del estudiante: ");
                                cedula=entrada.nextLine();
                            }else{
                                System.out.println("El libro no existe");
                            }
                            break;
                        case 2:
                            
                            break;
                        default:
                            System.out.println("Opcion incorrecta");
                            break;
                    }
                    codigo=entrada.nextInt();
                    
                    boolean bandera1=false;
                           
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