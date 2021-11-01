package Robotic;

public class RoboticImpl implements Robotic{

    private State state;

    public RoboticImpl() {
       this.state = new RoboticOff(this);
    }

    @Override
    public void walk() {
         state.executewalk();
    }

    @Override
    public void cook() {
     state.executecook();
    }

    @Override
    public void off() {
         state.executeoff();
    }

    @Override
    public void doActivty() {
       state.executedoActivty();
    }

    abstract class State {
        protected RoboticImpl robotic;
        public State(RoboticImpl robotic){
            this.robotic = robotic;
        }
        abstract void executewalk();
        abstract void executecook();
        abstract void executeoff();
        abstract void executedoActivty();

    }
    class RoboticCook extends State{

        public RoboticCook(RoboticImpl robotic) {
            super(robotic);
        }

        @Override
        void executewalk() {
            System.out.println("Walking...");
            state = new RoboticOn(robotic);
        }

        @Override
        void executecook() {
            System.out.println("Cooking...");
        }

        @Override
        void executeoff() {
            System.out.println("Cannot switched off while cooking...");
        }

        @Override
        void executedoActivty() {
            for(int i=0;i<3;i++)
                System.out.println("Activite de l'etat Cook......"+i);
        }

    }

    class RoboticOn extends State{

        public RoboticOn(RoboticImpl robotic) {
            super(robotic);
        }

        @Override
        void executewalk() {
            System.out.println("Walking...");
        }

        @Override
        void executecook() {
            System.out.println("Cooking...");
           state = new RoboticCook(robotic);
        }

        @Override
        void executeoff() {
            state = new RoboticOff(robotic);
            System.out.println("Robot is switched off");

        }

        @Override
        void executedoActivty() {
            for(int i=0;i<3;i++)
                System.out.println("Activite de l'etat ON......"+i);
        }

    }

    class RoboticOff extends State{

        public RoboticOff(RoboticImpl robotic) {
            super(robotic);
        }

        @Override
        void executewalk() {
            System.out.println("Walking...");
            state = new RoboticOn(robotic);
        }

        @Override
        void executecook() {
            System.out.println("Cannot cook at Off state.");
        }

        @Override
        void executeoff() {
            System.out.println("Already switched off...");

        }

        @Override
        void executedoActivty() {
            for(int i=0;i<3;i++)
                System.out.println("Activite de l'etat OFF......"+i);
        }

    }
}
