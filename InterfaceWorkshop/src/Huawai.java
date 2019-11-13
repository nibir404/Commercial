import java.util.Scanner;

public class Huawai {
    int ram,rom;

    public  void specs(){
        String color;
        Scanner sc = new Scanner(System.in);
        System.out.println("chose your favourite color");
        color = sc.next();
        System.out.println("you chose the "+color+" color");
    }
    public void price() {
        System.out.println("enter ram & rom");
        Scanner sc = new Scanner(System.in);
        ram = sc.nextInt();
        rom = sc.nextInt();
        if (ram>=4 && rom>=32){
            System.out.println("price will be more than 28,000");
        }
        else if (ram <= 4 && rom <= 32){
            System.out.println("price will be 28,000");
        }
        else System.out.println("Thank you");
    }

    public void buy(){
        Scanner sc = new Scanner(System.in);
        int back;
        System.out.println("If you want to buy it please press # ");
        back = sc.nextInt();
        if (back==0){
            System.out.println("Thank you for buying our product");
        }
        if (back!=0) {
            System.out.println("try again later");
        }
    }
}
