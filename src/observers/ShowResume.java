package observers;

import interfaces.Observable;
import interfaces.Observer;
import observables.Gps;

/**
 * Displays a console summary of GPS information (position).
 */
public class ShowResume implements Observer {
    @Override
    public void update(Observable o) {
        if (o != null){
            Gps g = (Gps) o;
            System.out.println("Position : "+g.getPosition() + " Precision of "+g.getPrecision() + " over 10");
        }

    }
}
