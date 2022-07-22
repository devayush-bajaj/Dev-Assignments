public class SwitchToIf {

    public void switchToif_meth(){
        int m = 1,x = 0;

        if(m==0) {
            x = x +2;
            System.out.println("X = " + x );
        }
        if(m==1) {
            x = x +4;
            System.out.println("X = " + x );
        }
        if(m==2) {
            x = x +6;
            System.out.println("X = " + x );
        }
    }

    public static void main(String[] args) {
        SwitchToIf switchToIf = new SwitchToIf();
        switchToIf.switchToif_meth();
    }
}
// OUTPUT --> X = 4
