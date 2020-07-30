
public class AudioVisuales{
    private String TituloAV;
    private int duracion, codigoAV;

    public AudioVisuales(String TituloAV, int duracion, int codigoAV) {
        this.TituloAV = TituloAV;
        this.duracion = duracion;
        this.codigoAV = codigoAV;
    }

    public String getTituloAV() {
        return TituloAV;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getCodigoAV() {
        return codigoAV;
    }
    
    
}
