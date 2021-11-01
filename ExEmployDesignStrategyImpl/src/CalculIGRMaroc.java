public class CalculIGRMaroc implements ICalculIGR{
    Employe  e = new Employe("BK684542",6000);
    @Override
    public float calculerIGR() {
        float salaireBrutAnuel=e.getSalaireBrutMensuel()*12;
        float taux=42;
        return salaireBrutAnuel*taux/100;
    }



}
