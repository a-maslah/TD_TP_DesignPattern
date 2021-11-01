public class ObserverImpl1 implements Observer{
    @Override
    public void update(Observable o) {
        int nouvelEtat = ((ObservableImpl1)o).getEtat();

        System.out.println("Observer 1 etat:"+nouvelEtat);
    }
}
