
import java.util.ArrayList;


public class Material {
    int codigo;
    private String titulo;
    private ArrayList<Libro> listaLibro;
    private ArrayList<AudioVisuales> listaAV;

    /*public Material(int codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
    }*/

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }
    
    public void agregarL(ArrayList<Libro> listaLibro){
        this.listaLibro=listaLibro;
    }    
    public void agregarAV(ArrayList<AudioVisuales> listaAV){
        this.listaAV=listaAV;
    }
    
    public void mostrar(){
        System.out.println("Lista de Libros\n");
        for(Libro l: listaLibro){
            System.out.println("Codigo: "+l.getCodigo()+"\nTitulo: "+l.getTitulo()+"\nArea: "
                    +l.getAreaPertenece()+"\nIdioma: "+l.getIdioma()+"\n");
        }
        
        System.out.println("\nLista de Audio Visuales\n");
        for(AudioVisuales av: listaAV){
            System.out.println("Codigo: "+av.getCodigoAV()+"\nDuracion: "+av.getDuracion()+"\nTitulo: "+av.getTituloAV()+"\n");
        }
    }    
}
