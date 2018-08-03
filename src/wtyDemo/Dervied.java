package wtyDemo;

public class Dervied  extends Base{
   private String name = "dervied";

    public Dervied() {
        tellName();
        printName();
    }

    public void tellName() {
        System.out.println("Dervied tell name: " + super.name);
    }

    public void printName() {
        System.out.println("Dervied print name: " + name);
    }

    public static void main(String[] args){

        new Dervied();
    }
}
