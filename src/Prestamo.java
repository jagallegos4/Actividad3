
import java.util.Date;

public class Prestamo {
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private Date fechaEntrega;
    private Estudiante estudiante;
    boolean atraso;

    public Prestamo(Date fechaPrestamo, Date fechaDevolucion, Date fechaEntrega, Estudiante estudiante, boolean atraso) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.fechaEntrega = fechaEntrega;
        this.estudiante = estudiante;
        this.atraso = atraso;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public boolean isAtraso() {
        return atraso;
    }  
}
