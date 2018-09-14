package interfaces;

/**
 * Interface implementable by all Observer
 */
public interface Observer {
    /**
     * Function automatically called by all oberver when position and precision of GPS changed
     * @param o ** This is an Observable **
     */
    void update(Observable o);
}
