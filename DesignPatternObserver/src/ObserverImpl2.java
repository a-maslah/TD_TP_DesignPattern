public class ObserverImpl2 implements Observer{
    @Override
    public void update(Observable o) {
        int nouvelEtat = ((ObservableImpl1)o).getEtat();

        System.out.println("Observer 2 etat:"+nouvelEtat);
    }
}
