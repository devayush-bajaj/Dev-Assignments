class CPU {
    double price(){
        return 75000.45;
    }
    // nested class
    class Processor {
        // members of nested class
        double cores(){
            return 5;
        }
        String manufacturer;

        double getCache() {
            return 4.3;
        }
    }

    // nested protected class
    protected class RAM {
        // members of protected nested class
        double memory(){
            return 15.75;
        }
        String manufacturer(){
            return "Asus";
        }


        double getClockSpeed() {
            return 5.5;
        }
    }

}
//---------------------------------------------------------------------------------------------------//
public class completeTheCode{
    public static void main (String[]args){
        CPU cpu = new CPU();
        CPU.Processor Processor = cpu.new Processor();  //Creating objects of inner class  using outer class
        CPU.RAM RAM = cpu.new RAM();
        System.out.println("Processor Cache = " + Processor.getCache());
        System.out.println("Ram Clock speed = " + RAM.getClockSpeed());
        System.out.println("Price = " + cpu.price());
        System.out.println("processor = " + Processor.cores());
        System.out.println("Ram Clock speed = " + RAM.memory());
        System.out.println("Manufacturer = " + RAM.manufacturer());
    }
}