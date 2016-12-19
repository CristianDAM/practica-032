import java.time.LocalDate;
import java.util.ArrayList;
/**
 * Write a description of class Tarea here.
 * 
 * @author (Cristian) 
 * @version (a version number or a date)
 */
public class Tarea
{
    private String descripcion;
    private boolean tareaAcabada;
    private int prioridad;
    
    private LocalDate fecha;

    /**
     * Constructor for objects of class Tarea
     */
    public Tarea(String descripcion)
    {
        this.descripcion = new String(descripcion);
        tareaAcabada = false;
        prioridad = 0;
      
        fecha = null;
    }

    /**
     * Metodo que permite marcar una tarea como completada
     */
    public void tareaCompletada() {
        tareaAcabada = true;
    }

    /**
     * Metodo que permite obtener la descripcion de la tarea
     */
    public String getDescripcion(){

        return descripcion;
    }

    public boolean estaTerminada()
    {
        return tareaAcabada;
    }

    public void marcarTareaCompletada()
    {
        tareaAcabada = true;

    }

    public String toString()
    {
        String textoADevolver = "";
        if (tareaAcabada)
        {
            textoADevolver += "HECHA";
        }
        textoADevolver += descripcion + "(" + prioridad + ")";
        return textoADevolver;
    }

    public void cambiarPrioridad(int prioridad)
    {
        this.prioridad = prioridad;
    }

    public void marcarFecha(int nuevoDia, int nuevoMes, int nuevoAnio)
    {
       fecha = new LocalDate( int nuevoDia, nuevoMes, nuevoAnio);

    }
   
 
}