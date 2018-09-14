package interfaces;

/**
 * Interface implementable by all classes which want to be followed
 */
public interface Observable {
    /**
     * Add new observer
     * @param o ** observer as parameter **
     */
    void addObserver(Observer o);

    /**
     * Delete  observer
     * @param o ** observer as parameter **
     */
    void delObserver(Observer o);

    /**
     * Method to notify all observer if state changed
     */
    void notifyObservers();
}
