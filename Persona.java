
/**
 * Write a description of class Persona here.
 * 
 * @author (Nero Hornet) 
 * @version (a version number or a date)
 */
public class Persona
{
    // guarda el nombre de la persona.
    private String nombrePersona;
    // guarda si la persona es hobmbre o mujer.
    private boolean hombreOMujer;
    // guarda el peso de la persona.
    private int peso;
    // guarda la altura de la persona.
    private int altura;
    // guarda los años de la persona.
    private int year;
    
    // guarda las calorias que ha comido a lo largo del dia.
    private int caloriasIngeridas;
    // guarda las maxaima de calorias que puede comer un hombre.
    private int metabolismoHombre;
    // guarda las maxaima de calorias que puede comer un hombre.
    private int metabolismoMujer;

    /**
     * Constructor for objects of class Persona
     */
    public Persona(String nombre, boolean sexoHombre, int pesoKg, int alturaCm, int edad)
    {
        nombrePersona= nombre;
        hombreOMujer=sexoHombre;
        peso=pesoKg;
        altura=alturaCm;
        year=edad;
        caloriasIngeridas= 0;
        metabolismoHombre=0;
        metabolismoMujer=0;
    }

    /**
     *
     */
    public int comer(Comida comida)
    {
        int haComido=-1;
        if (hombreOMujer ==true){
            //Hombres = (10 x peso en kg) + (6 × altura en cm) - (5 × edad en años) + 5
            metabolismoHombre=(10*peso)+(6*altura)+(5*year)+5;
            if (metabolismoHombre>=caloriasIngeridas){
                haComido=comida.getCalorias();
                caloriasIngeridas= caloriasIngeridas+comida.getCalorias();
            }
            
        }
        else{
            //Mujeres = (10 x peso en kg) + (6 × altura en cm) - (5 × edad en años) - 161
            metabolismoMujer=(10*peso)+(6*altura)+(5*year)-161;
            if(metabolismoMujer>=caloriasIngeridas){
                haComido=comida.getCalorias();
                caloriasIngeridas= caloriasIngeridas+comida.getCalorias();
            }

        }
        return haComido;
    }
    
    public int getCaloriasIngeridas(){
        return caloriasIngeridas;
    }
}
