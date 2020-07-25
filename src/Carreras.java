
import java.util.ArrayList;


public class Carreras {
    private String nombreCarrera, nombreDirector;
    private int duracionCarrera;
    private ArrayList<Estudiante> listaE = new ArrayList();

    public Carreras(String nombreCarrera, String nombreDirector, int duracionCarrera) {
        this.nombreCarrera = nombreCarrera;
        this.nombreDirector = nombreDirector;
        this.duracionCarrera = duracionCarrera;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public String getNombreDirector() {
        return nombreDirector;
    }

    public int getDuracionCarrera() {
        return duracionCarrera;
    }
    
    public void agregarEstudianteACarrera(Estudiante estudiante1){
        listaE.add(estudiante1);
    }
    
    /*public static void addEstudiante(ArrayList<Estudiante> listadoE){
        this.listadoE=listadoE;        
    }*/
    
    /*public void mostrarEstudiante(){
        System.out.println("Lista de Estudiantes");
        for(int i=0;i<listadoE.size();i++){
            System.out.print("Nombre: "+listadoE.get(i).getNombre()
                    +"\nNo de Cedula: "+listadoE.get(i).getCedula()
                    +"\nGenero: "+listadoE.get(i).getGenero());
        }
    }*/
}
