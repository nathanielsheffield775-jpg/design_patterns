package observer;

public interface Subject {
    
    /**
     * Registers the observer.
     *
     * @param observer observer
     */
    void registerObserver(Observer observer);
    /**
     * Removes the observer.
     *
     * @param observer observer
     */
    void removeObserver(Observer observer);
    /**
     * Notifies the observers.
     *
     * @param stock stock
     * @param direction direction
     */
    void notifyObservers(Stock stock, Direction direction);

}