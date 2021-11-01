import java.util.ArrayList;
import java.util.List;

public class ObservableImpl1 implements Observable{

    List<Observer> observers = new ArrayList<>();

    private int etat;

    @Override
    public void addObserver(Observer observer) {
     observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer o:observers){
            o.update(this);
    }
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
        this.notifyObservers();
    }
}
