package observables;

import interfaces.Observable;
import interfaces.Observer;

import java.util.ArrayList;

/**
 * Class which represent GPS (Equipment allows to know position )
 */
public class Gps implements Observable
{
    private String position;// Position of GPS.
    private int precision;// Precision allows to this position  (according to the number of satellites used).
    private ArrayList<Observer> tabObserver;// Observer stack.

    /**
     * Constructor
     */
    public Gps()
    {
        position="unknown";
        precision=0;
        tabObserver = new ArrayList<>();
    }

    /**
     * Adds (subscribe) an observer listening to GPS.
     * @param o ** Observer as paramter **
     */
    public void addObserver(Observer o)
    {
        tabObserver.add(o);
    }

    /**
     * Del (unsubscribe) an observer listening to GPS.
     * @param o ** Observer as paramter **
     */
    public void delObserver(Observer o)
    {
        tabObserver.remove(o);
    }

    /**
     * Method for notifying all observers during a GPS status change.
     */
    public void notifyObservers()
    {
        for (Observer aTabObserver : tabObserver) {
            aTabObserver.update(this);// it uses Method "shot"
        }
    }

    /**
     * Méthode qui permet de mettre à jour de façon artificielle le GPS.
     * Dans un cas réel, on utiliserait les valeurs retournées par les capteurs.
     * @param position ** parameter **
     * @param precision ** parameter **
     */
    public void setMesures(String position, int precision)
    {
        this.position=position;
        this.precision=precision;
        notifyObservers();
    }

    /**
     * Method "shot" so it is up to the observers to get the desired values through a Gps object.
     * For this we find a read accessor for position.
     * @return string
     */
    public String getPosition()
    {
        return position;
    }

    /**
     * Getter precision
     * @return int
     */
    public int getPrecision()
    {
        return precision;
    }
}
