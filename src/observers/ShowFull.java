package observers;

import interfaces.Observable;
import interfaces.Observer;
import observables.Gps;

/**
 * Displays in a complete console the information (position and precision) of the GPS.
 */
public class ShowFull implements Observer {
    @Override
    public void update(Observable o) {
        if (o != null){
            Gps g = (Gps) o;
            System.out.println("Position : " + g.getPosition());
        }
    }
}
