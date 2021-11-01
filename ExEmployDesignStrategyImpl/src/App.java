import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

    Context context = new Context();

      /*  System.out.println("IGR pour Maroc");
        context.setiCalculIGR(new CalculIGRMaroc());
        System.out.println(context.calculerIGRPay());
        System.out.println("IGR pour Algerie");
        context.setiCalculIGR(new CalculIGRAlgerie());
        System.out.println(context.calculerIGRPay());
       */
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Donner le nom du Pay pour calculer IGR");
            String strategyclassName = scanner.nextLine();
            ICalculIGR strategy = (ICalculIGR) Class.forName(strategyclassName).newInstance();

            context.setiCalculIGR(strategy);
            System.out.println(context.calculerIGRPay());


        }

    }
}
