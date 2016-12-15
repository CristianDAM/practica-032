

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ListaDeTareasTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ListaDeTareasTest
{
    private ListaDeTareas listaDeT1;

    /**
     * Default constructor for test class ListaDeTareasTest
     */
    public ListaDeTareasTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        listaDeT1 = new ListaDeTareas();
        listaDeT1.aniadirTareaConComentario("beber");
        listaDeT1.aniadirTareaConComentario("madrid");
        listaDeT1.aniadirTareaConComentario("estudiar");
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
