import java.util.Scanner;



//İsmail BABACAN  01.12.2022

public class StoreUsingArrays_20210808032 {


    public static void main(String[] args) {
  
        String[] item={"bread","cola","snickers","AYRAN"};
        int[] quantity={10,15,12,30};
        double[] price =  {0.75,2.50,2.25,1};

        
        
        System.out.println("************Store Inventory*************");
        System.out.println("Welcome to our store.");
        storeRun(item,price,quantity);
     
        


}

public static int menu(String[] item,double [] price, Scanner input){
    
    System.out.println("Please enter what would you like:");
        int temp=1;
        for (int i=0;i<item.length;i++){
           System.out.println(temp+" - for "+item[i]+"  "+"("+price[i]+")");
            temp++;
            }
            System.out.println("0 - to checkout");
            int choose = input.nextInt();
            System.out.println("Your choice was " + choose);
            if (choose>4 || choose<0){
                System.out.println("Please enter between 0-4");
                return  -2;
            }
            
            return choose;  
  }

  public static void storeRun(String[] item,double [] price,int[] quantity) {
    Scanner input= new Scanner(System.in);
    capitalizeArray(item);
    double totalCost=0;
    while(true){

      int choose=  menu(item,price,input);
        
        if(choose==0){
            break;
        }

        else if (choose==-2){
            System.out.println("ERROR: Invalid choice.");
        }
        else if(quantity[choose-1]<0)
        {
            System.out.println("ERROR: Invalid request.");
        }
        else {
         totalCost+=price[choose-1];
         quantity[choose-1]--;
        }
    }
       System.out.println("*****Total Due*******");
       System.out.println("Total Due:" + totalCost);

       while(true)
       {
       System.out.println("Please enter amount given:");
       double amountgiven=input.nextDouble();
       if (amountgiven<totalCost){
        System.out.println("Not enough payment given");
        continue;
       }
    
       double temp2=amountgiven-totalCost;
       System.out.println("Thank you for your business. Your change given is:");
       System.out.println(returnedAmounts(temp2));
       break;
    }

    
    
  }

  public static String returnedAmounts(double cost) {
    double[] banknot = {200, 100, 50, 20, 10, 5, 1, 0.50, 0.25, 0.10, 0.05, 0.01};
    int[] temp = new int[banknot.length];
    String temp3 ="";
    for (int i=0 ; i<banknot.length;i++ ){
        if(cost>=banknot[i])
        {
            temp[i]++;
            cost-=banknot[i]; 
        }

        else{
            continue;
        }
    }

    for(int i = 1; i<banknot.length;i++)
    {
        if(!(temp[i]==0))
        {
           temp3 += temp[i] + " - " + banknot[i]+ "\n";
        }
    }

    return temp3;
    
  }

public static String capitalizeString (String text) {

    char p2 = text.charAt(0);
    p2 = Character.toUpperCase(p2);
    text=(p2 + text.substring(1).toLowerCase());
    return text;
}


public static void capitalizeArray(String[] item) {
    for (int i=0;i<item.length;i++){
    item[i] =  capitalizeString(item[i]);
    }
}



}

    
























