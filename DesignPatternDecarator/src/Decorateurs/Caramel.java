package Decorateurs;

import Composants.Boisson;

public class Caramel extends Decorator{

    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return boisson.cout()+1.8;
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+"  au Caramel";
    }
}
