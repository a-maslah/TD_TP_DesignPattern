package Composants;

import Decorateurs.Caramel;
import Decorateurs.Chantilly;
import Decorateurs.Chocolat;
import Decorateurs.Vanille;

public class App {

    public static void main(String[] args) {
        /*Composants.Boisson boisson = new Composants.Deca();
        System.out.println(boisson.getDescription()+" "+boisson.cout());
         */


        Boisson b1=new Chantilly(new Caramel(new Chocolat(new Chantilly(new Chocolat(new Vanille(new Sumetra()))))));

        System.out.println(b1.getDescription());
        System.out.println(b1.cout());
        System.out.println("----------------------------------");

        Boisson b2=new Colombia();
        b2 = new Vanille(b2);
        b2 = new Caramel(b2);
        b2 = new Chocolat(b2);
        b2 = new Chantilly(b2);

        System.out.println(b2.getDescription()+" "+b2.cout());

        System.out.println("----------------------------------");

        Boisson b3=new Espresso();
        b3 = new Chocolat(b3);
        b3 = new Vanille(b3);
        b3 = new Caramel(b3);
        b3 = new Chocolat(b3);

        System.out.println(b3.getDescription()+" "+b3.cout());




    }
}
