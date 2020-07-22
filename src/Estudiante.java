
public class Estudiante {
    private String cedula, nombre, genero;
    private int numObj;

    public Estudiante(String cedula, String nombre, String genero, int numObj) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.genero = genero;
        this.numObj = numObj;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumObj() {
        return numObj;
    }

    public void setNumObj(int numObj) {
        this.numObj = numObj;
    }
    
    
    
}
