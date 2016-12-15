
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

    /**
     * Constructor for objects of class Tarea
     */
    public Tarea(String descripcion)
    {
        this.descripcion = new String(descripcion);
        tareaAcabada = false;
    }

    /**
     * Metodo que permite marcar una tarea como completada
     */
    public void tareaCompletada() {
        tareaAcabada = true;
    }

}
