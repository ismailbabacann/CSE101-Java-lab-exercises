//İsmail BABACAN  11.11.2022
import java.util.Scanner;
public class TwoltemStore_20210808032 {
public static void main(String[] args) {
    System.out.println("************Store Inventory*************");
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the name of product 1:");
    String product1 =input.nextLine();
    char p1 = product1.charAt(0);
    while(true) {
    if (!(Character.isLetter(p1))) {
        System.out.println("ERROR:Value cannot be number Exiting.");
        break;
    }
    else {
            p1 = Character.toUpperCase(p1);
        }
        String Product1=(p1 + product1.substring(1).toLowerCase());
    
    System.out.print("Enter the number of "+ Product1+" we have:");
    int numberbread =input.nextInt();
    if (numberbread<0 ) {
        System.out.println("ERROR:value cannot be negative. Exiting.");
        break;
    }
    System.out.print("Enter the cost of "+Product1+":");
    double costofbread =input.nextDouble();
    if (costofbread<0) {
        System.out.println("ERROR:value cannot be negative. Exiting.");
        break;
    }

    //----------------------------------------------------------------------------------------------
    
    System.out.print("Enter the name of product 2:");
    String product2 =input.next();
    char p2 = product2.charAt(0);
    if (!(Character.isLetter(p2))) {
        System.out.println("ERROR:Value cannot be number Exiting.");
        break;
    }
    else {
        p2 = Character.toUpperCase(p2);
    }
        String Product2=(p2 + product2.substring(1).toLowerCase());
       
    System.out.print("Enter the number of "+Product2+" we have:");
    int numbercola =input.nextInt();
    if (numbercola<0) {
        System.out.println("ERROR: Undefined entry or value cannot be negative. Exiting.");
        break;
    }
    System.out.print("Enter the cost of "+Product2+":");
    double costofcola =input.nextDouble();
    if (costofcola<0) {
        System.out.println("ERROR: Undefined entry or value cannot be negative. Exiting.");
        break;
    }

    //----------------------------------------------------------------------------------------------

    System.out.println("*************Customer User Interface***********");
    int choose=-1;
    int c1=-2;
    int c2=-2;
    while (!(choose==0)) {
    System.out.println("Welcome to our store.We have the following.Please enter what you would like:");
        System.out.println("1-"+Product1);
        System.out.println("2-"+Product2);
        System.out.println("0-Checkout");
        choose=input.nextInt();
        if((choose==1^choose==2^choose==0)) {
            switch (choose) {
        case 1:
        do {
        System.out.println("How many "+Product1+" would you like?");
        c1=input.nextInt();
        if (c1<=0) {
            System.out.println("ERROR: Invalind requested amount.");
            break;
        }   
        else if (!(numberbread>=c1)) {
                System.out.println("ERROR: we do not have that many remaining");
                break;
            }
        }while (!(c1>0 && numberbread>=c1));
        break;
        case 2:
        System.out.println("How many "+Product2+" would you like?");
        do {
            c2=input.nextInt();
            if (c2<=0) {
                System.out.println("ERROR: Invalind requested amount.");
                break;
            }   
            else if (!(numbercola>=c2)) {
                System.out.println("ERROR: we do not have that many remaining");
                break;
                }
            }while (!(c2>0 && numbercola>=c2));
            break;
        case 0:
        break;
        }
        }
        else {
            System.out.println("ERROR : Invalid menu option");
            continue;
            }
        }
        if (choose==0) {
            //I do it this if statements for if customer didn't buy any or just one of them it makes correct final calculate
            if(c1==-2){
                c1=0;
            }
            if(c2==-2){
                c2=0;
            }
        System.out.println("********Customer Total*********");
        System.out.println(Product1+"->"+(c1)+"X"+(costofbread)+"="+(c1*costofbread));
        System.out.println(Product2+"->"+(c2)+"X"+(costofcola)+"="+(c2*costofcola));
        System.out.println("---------------------------------");
        System.out.println("Total Due: "+((c1*costofbread)+(c2*costofcola)));
        System.out.println("**********Final Report**********");
        System.out.println("We now have the remaining amounts of our products:");
        System.out.println(Product1+"--> "+(numberbread-c1));
        System.out.println(Product2+"--> "+(numbercola-c2));
        break;
    }
    }
        















}   
}

    
























