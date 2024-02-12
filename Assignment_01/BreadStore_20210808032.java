import java.util.Scanner;
public class BreadStore_20210808032
{
// @author İsmail BABACAN @date 18.10.2022
public static void main(String[] args)
{
boolean j = true;
do
{
Scanner inp = new Scanner(System.in);
System.out.println("---bread store inventory---");
System.out.print("enter number of bread we have:");
int bnumber = inp.nextInt();
System.out.print("Enter the cost of bread : ");
double bcost = inp.nextDouble();
if (bnumber < 0 || bcost < 0) {
System.out.println("numbers cannot be negative ERROR");
break;
}
System.out.println("---customer user interface---");
System.out.print("welcome to our store. We have " + bnumber + " loaves of bread available. How many would you like? ");
int onumber = inp.nextInt();
if (onumber < 0) {
System.out.println("number cannot be negative ERROR");
}
else if (bnumber<onumber) {
System.out.println("We do not have that many remaining.");
System.out.println("We now have " + bnumber + " loaves of bread remaining");
break;
}
else {
double total = onumber * bcost;
System.out.println("Your cost is : " + total);
System.out.println("Thank you for shopping with us today.");
System.out.println("We now have " + (bnumber - onumber) + " loaves of bread remaining");
}
}
while (j);   
}
}
