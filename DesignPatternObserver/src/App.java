public class App {

    public static void main(String[] args) {

        ObservableImpl1 observableImpl1 = new ObservableImpl1();
        ObserverImpl1 o1 = new ObserverImpl1();
        ObserverImpl2 o2 = new ObserverImpl2();
        System.out.println("---- Changement d'etat -----");
        observableImpl1.setEtat(80);

        observableImpl1.addObserver(o1);
        observableImpl1.addObserver(o2);
        observableImpl1.setEtat(90);
        System.out.println("---- Changement d'etat -----");
        observableImpl1.setEtat(120);
        observableImpl1.removeObserver(o2);
        observableImpl1.setEtat(50);

    }
}
