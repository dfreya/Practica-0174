
/**
 * Write a description of class Comida here.
 * 
 * @author (Nero Hornet) 
 * @version (a version number or a date)
 */
public class Comida
{
    // indicar el nombre de la comida.
    private String nombreComida;
    //indicar la cantidad de calorias asociadas a la comida.
    private int calorias;

    /**
     * Constructor for objects of class Comida
     */
    public Comida(String nombre, int caloriasQueTiene)
    {
        nombreComida=nombre;
        calorias=caloriasQueTiene;
    }

    /**
     *
     */
    public int getCalorias()
    {
        return calorias;
    }
}
