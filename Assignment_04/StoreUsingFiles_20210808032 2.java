import java.io.*;
import java.util.Scanner;

public class StoreUsingFiles_20210808032{
    // İSMAİL BABACAN  21.12.2022
    public static void main(String[] args) {

            String filename = args[0];

            try {
            
                File dosya =new File(filename +"_Receipt.txt");
                File dosya2 =new File(filename +"_ProductInfoAfterOrder.txt");
                File dosya3 =new File(filename+".log");
            
                dosya.createNewFile();
                dosya2.createNewFile();
                dosya3.createNewFile();
        
             }catch (Exception e){
            
                 System.out.println(e.getMessage());
            }


            int productcount=countProduct(filename+"_ProductInfo.txt");
            String[] itemId=new String[productcount];
            String[] itemName=new String[productcount];
        
            int[] quantity=new int[productcount];
            int[] sold = new int[productcount];
            double[] price = new double[productcount];
        
        
        getProductInfo(itemId,itemName,quantity,price,filename+"_ProductInfo.txt");

        boolean isFound;
        
            try {
                PrintWriter Tmpwrite =new PrintWriter(filename +".log");
                Scanner reader = new Scanner(new FileReader((filename+"_Order.txt")));
                    
                while (reader.hasNext()) {
                        isFound=false;
                        String temp=reader.next();

                            for(int i =0;i<itemId.length;i++){

                                if(temp.equals(itemId[i])){
                                    isFound=true;
                                    int tmpAmount=Integer.parseInt(reader.next());
                                
                                    if(tmpAmount<0){
                                        Tmpwrite.write("Error: Invalid amount request ("+ tmpAmount+")\n"  );
                                    }
                                    else if(tmpAmount+sold[i]> quantity[i] ){
                                        Tmpwrite.write("Error: "+itemName[i]+" - " +tmpAmount+ " request but only " + (quantity[i]-sold[i]) + " remaining.\n");
                                    }
                                else{
                                    sold[i] += (1 * tmpAmount);
                                    }
                    }
                }
                        if(isFound==false){
                            Tmpwrite.write("Error: Product " +temp+ " not found\n");
                                reader.next();
                        }
                    }
                    Tmpwrite.close();
            }catch (Exception h){
                    
            }
            
        
        receipt(itemId,itemName,sold,price,filename+"_Receipt.txt");

            for (int i=0;i<sold.length;i++){
                quantity[i]-=sold[i];
            }
        
            writeProductInfo(itemId,itemName,quantity,price,filename +"_ProductInfoAfterOrder.txt");

            
            
    }

    public static void receipt(String[] itemID,String[] itemName, int[] sold, double[] price, String fileName){
       
        double result=0;
            
            try {
                PrintWriter printWriter =new PrintWriter(fileName);
                printWriter.write("******* Customer Receipt ******\n");
                    for (int i=0;i<sold.length;i++){
                        if(sold[i]!=0){
                            printWriter.write(itemName[i] + " (" + itemID[i] + ") - "+ sold[i] + "*" +price[i]+" = " + (sold[i]* price[i]) +"\n");
                            result+=(sold[i]* price[i]);
                }
            }
            
            printWriter.write("--------------------\n");
            printWriter.write("Total due -" +result);
            printWriter.close();

        }catch (Exception h){}
    }

    public static int countProduct(String fileName){
        int countrow =0;
            try {
                FileReader file = new FileReader(fileName);
                Scanner s=new Scanner(file);
            
            
                    while (s.hasNext()){
                        
                        countrow++;
                        s.nextLine();
                }
                        s.close();

                return countrow;

        }catch (Exception e){

            System.out.println(e.getMessage());
        
        }

        return countrow;
    }

    public static void getProductInfo(String[] itemID,String[] itemName, int[] quantity, double[] price, String fileName){

        try {
            int counter =0;
            Scanner scan=new Scanner(new FileReader(fileName));
            
                while (counter<itemID.length)
                {
                    itemID[counter]= scan.next();
                    itemName[counter]=scan.next();
                    quantity[counter]= scan.nextInt();
                    price[counter]=Double.parseDouble(scan.next());
                    counter++;
            
                 }
                    scan.close();


        } catch (Exception h) {
            System.out.println(h.getMessage());
        }
    }


    public static void writeProductInfo(String[] itemID,String[] itemName, int[] quantity, double[] price, String fileName){
            try {

                PrintWriter scan = new PrintWriter(new FileWriter(fileName));
                    for(int i =0;i<itemID.length;i++)
                {
                    scan.write(itemID[i] +" " + itemName[i] +" "+ quantity[i] +" "+ price[i] +"\n");
                }
                scan.close();
        
            }catch (Exception h){
           
            System.out.println(h.getMessage());
        }
    }
}



