
public class AudioVisuales extends Material{
    
    private int duracion;

    public AudioVisuales(int duracion, int codigo, String titulo) {
        super(codigo, titulo);
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }
    
    
    
}
