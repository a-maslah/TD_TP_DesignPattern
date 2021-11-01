public class Context {
    protected ICalculIGR iCalculIGR;

     public float calculerIGRPay(){
         return iCalculIGR.calculerIGR();
     }

        public void setiCalculIGR(ICalculIGR iCalculIGR) {
        this.iCalculIGR = iCalculIGR;
    }

}
