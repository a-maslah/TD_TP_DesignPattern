package Decorateurs;

import Composants.Boisson;

public class Chocolat extends Decorator{


    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return boisson.cout()+1.5;
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+"  au Chocolat";
    }
}
