package Decorateurs;

import Composants.Boisson;

public class Chantilly extends Decorator{

    public Chantilly(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return boisson.cout()+0.7;
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + "  au Chantilly";
    }
}
