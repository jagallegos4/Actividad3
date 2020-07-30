
public class Libro {
    private String titulo, idioma, areaPertenece;
    private int codigo;

    public Libro(String idioma, String areaPertenece, int codigo, String titulo) {
        //super(codigo, titulo);
        this.codigo=codigo;
        this.titulo=titulo;
        this.idioma = idioma;
        this.areaPertenece = areaPertenece;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCodigo() {
        return codigo;
    }
    

    public String getIdioma() {
        return idioma;
    }

    public String getAreaPertenece() {
        return areaPertenece;
    }
    
    
}
