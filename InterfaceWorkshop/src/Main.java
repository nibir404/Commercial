
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" chose your option : ");
        System.out.println("1 - samsung " + " 2 - iphone "+" 3 - Huawai");
        Scanner input = new Scanner(System.in);
        int num;
        num = input.nextInt();
        Samsung s = new Samsung();
        Iphone i = new Iphone();
        Huawai h = new Huawai();
        if (num==1){
            System.out.println("you have chosen Samsung");
            s.specs();
            s.price();
            s.buy();
        }
        if (num ==2){
            System.out.println("you have chosen Iphone");
            i.specs();
            i.price();
            i.buy();
        }
        if (num == 3){
            System.out.println("you have chosen Huawai");
            h.specs();
            h.price();
            h.buy();
        }
        if (num!=1 && num!=2 && num!=3){
            System.out.println("You choose nothing , please try again");
        }

    }
}
