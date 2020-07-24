
public class Libro extends Material{
    private String idioma, areaPertenece;

    public Libro(String idioma, String areaPertenece, int codigo, String titulo) {
        super(codigo, titulo);
        this.idioma = idioma;
        this.areaPertenece = areaPertenece;
    }

    public String getIdioma() {
        return idioma;
    }

    public String getAreaPertenece() {
        return areaPertenece;
    }
    
    
}
