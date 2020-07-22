
public class Carreras {
    private String nombreCarrera, nombreDirector;
    private int duracionCarrera;

    public Carreras(String nombreCarrera, String nombreDirector, int duracionCarrera) {
        this.nombreCarrera = nombreCarrera;
        this.nombreDirector = nombreDirector;
        this.duracionCarrera = duracionCarrera;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public String getNombreDirector() {
        return nombreDirector;
    }

    public void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }

    public int getDuracionCarrera() {
        return duracionCarrera;
    }

    public void setDuracionCarrera(int duracionCarrera) {
        this.duracionCarrera = duracionCarrera;
    }
    
    
    
}
