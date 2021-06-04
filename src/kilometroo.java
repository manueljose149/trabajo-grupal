import java.util.Scanner;
public class kilometroo {
    public void metros(){
        double kilometros=0, metros=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("ingrese los kilometros");
        kilometros=obj.nextDouble();
        metros=kilometros*1000;
        System.out.println("el equivalente es igual a"+metros+"metros");
    }
}
