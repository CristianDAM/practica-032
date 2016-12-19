import java.util.ArrayList;
import java.time.LocalDate;
/**
 * Write a description of class listaDeTareas here.
 * 
 * @author (Cristian) 
 * @version (a version number or a date)
 */
public class ListaDeTareas
{
    private ArrayList<Tarea> listaDeTareas;
    private ArrayList<Boolean> tareasAcabadas; 
    
    /**
     * Constructor for objects of class listaDeTareas
     */
    public ListaDeTareas()
    {
        listaDeTareas = new ArrayList<Tarea>();  
        tareasAcabadas = new ArrayList<Boolean>();
        
    }

    /**
     * Metodo que permite añadir una tarea a nuestra lista de tareas
     */
    public void aniadirTareaConComentario(String descripcion){
        Tarea nuevaTarea = new Tarea(descripcion);
        listaDeTareas.add(nuevaTarea);
        tareasAcabadas.add(false);
    }

    /**
     * Metodo que permite las tareas numeradas pudiendo ver si estan completas o no
     */
    public void mostrarTareas()
    {

        int numeroDePosicion = 1;
        for( Tarea tarea : listaDeTareas)
        {


            System.out.println(numeroDePosicion + ". " + tarea.toString());
            numeroDePosicion++;
        }
    }

    /**
     * Metodo que marca una tarea como completada.
     *  empezando por 1
     */
    public void marcarTareaCompletada (int numTarea)
    {
        int posicionReal = numTarea - 1;
        if(posicionReal >= 0 && posicionReal < listaDeTareas.size())
        {
            listaDeTareas.get(posicionReal).marcarTareaCompletada();

        }
    }

    /**
     * Metodo que muestra las tareas coincidentes con el texto que pase al metodo y permite saber si estan hechas o no
     */
    public void mostrarCoincidentes (String textoABuscar)
    {
        int posicion = 0;
        while(posicion < listaDeTareas.size())
        {
            Tarea tareaActual = listaDeTareas.get(posicion);
            if(tareaActual.getDescripcion().contains(textoABuscar))
            {

                System.out.println((posicion + 1) + ". "  + tareaActual.toString());

            }
            posicion++;
        }
    }

    /**
     * Metodo que permite eliminar una tarea pasandole un numero 
     */
    public void eliminarTarea( int posicionTarea)
    {
        int posicionReal = posicionTarea - 1;
        if(posicionReal >= 0 && posicionReal < listaDeTareas.size())
        {
            listaDeTareas.remove(posicionReal);

        }

    }

    /**
     * Metodo que indica la prioridad de las tareas
     */
    public void marcarPrioridadTarea(int posicionCambiar, int prioridad)
    {
        int posicionRealCambiar = posicionCambiar - 1;
        if(posicionRealCambiar >= 0 && posicionRealCambiar < listaDeTareas.size())
        {
            if (prioridad >= 0 && prioridad <= 5)
            {
                listaDeTareas.get(posicionRealCambiar).cambiarPrioridad(prioridad);

            }
        }

    }
    
   
    
   
    

   
}

