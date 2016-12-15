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
            
            String textoAMostrar = "";
            textoAMostrar = textoAMostrar + numeroDePosicion + ". ";
            if (tareasAcabadas.get(numeroDePosicion - 1) == true) {
                textoAMostrar = textoAMostrar + "HECHO";
            }
            textoAMostrar = textoAMostrar + tarea.getDescripcion();
            System.out.println(textoAMostrar);
            numeroDePosicion++;
        }
    }

        /**
         * Metodo que marca una tarea como completada.
         *  empezando por 1
         */
        public void marcarTareaCompletada (int numTarea)
        {

        if(numTarea > 0 && numTarea <= listaDeTareas.size())
        {
            tareasAcabadas.set(numTarea - 1, true);

        }
    }
}



