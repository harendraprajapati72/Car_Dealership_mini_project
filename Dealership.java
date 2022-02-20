import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to java Dealership");
        System.out.println("Select option 'a' to by a car");
        System.out.println("Select option 'b' to sell a car");
        String option=sc.nextLine();
        switch(option){
            case "a": 
            System.out.println("What is your budget?");
            int budget=sc.nextInt();
            if(budget>=1000000){
                System.out.println("Great! a Nissan Altima ia available! ");
                System.out.println("\n Do you have insurance?. write 'yes' or 'no'");
                sc.nextLine();
                String insurance=sc.nextLine();
                System.out.println("\n Do you have Driving License?. write 'yes' or 'no'");
                String drivingLicense=sc.nextLine();
                System.out.println("\n What is your creadit score?. write 'yes' or 'no'");
                int creaditScore=sc.nextInt();
                if(insurance.equals("yes") && drivingLicense.equals("yes") && creaditScore>700){
                    System.out.println("Sold! Pleasure Doing Business With You ");
                }else{
                    System.out.println("Sorry! You are not eligible");
                }
            }else{
                System.out.println("We Don't sell a car under 100000. Sorry!");
            }
            case "b": System.out.println("\nWhat is your car valued?");
            int value=sc.nextInt();
            System.out.println("\nWhat is Your selling Price?");
             int price=sc.nextInt();
            if(value > price && price < 3000000){
                 System.out.println("\nWe will by Your car. pleasure doing business with you!");
                }else{
                 System.out.println("\nSorry we are not intrested!");
             }
             break;
             default: System.out.println("Invalid option");break;
        }
        sc.close();
    }
    
}
