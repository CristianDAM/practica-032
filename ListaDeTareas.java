import java.util.ArrayList;
/**
 * Write a description of class listaDeTareas here.
 * 
 * @author (Cristian) 
 * @version (a version number or a date)
 */
public class ListaDeTareas
{
    private ArrayList<Tarea> listaDeTareas;
    /**
     * Constructor for objects of class listaDeTareas
     */
    public ListaDeTareas()
    {
        listaDeTareas = new ArrayList<Tarea>();  
    }

    public void aniadirTareaConComentario(String descripcion){
        Tarea nuevaTarea = new Tarea(descripcion);
        listaDeTareas.add(nuevaTarea);
        
    }
     
    
  
    
}
