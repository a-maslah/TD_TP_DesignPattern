package Decorateurs;

import Composants.Boisson;

public class Vanille extends Decorator{


    public Vanille(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return boisson.cout()+0.9;
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+"  avec Vanille";
    }
}
