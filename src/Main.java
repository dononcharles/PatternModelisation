import observables.Gps;
import observers.ShowFull;
import observers.ShowResume;

/**
 * Application entry point
 */
public class Main {

    public static void main(String[] args){
        // Create Gps object observable
        Gps g = new Gps();

        // Creation of two observer
        ShowResume ar = new ShowResume();
        ShowFull ac = new ShowFull();

        // Add ShowResume as observer to GPS
        g.addObserver(ar);
        // We stimulate new entry of position trough sensors
        g.setMesures("N 39°59°993 / W 123°00°000", 4);

        g.addObserver(ac);
        // We stimulate new entry of position trough sensors
        g.setMesures("N 37°48°898 / W 124°12°011", 5);
    }
}

