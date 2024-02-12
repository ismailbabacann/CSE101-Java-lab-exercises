import java.util.Scanner;
public class Exercise01_20210808032
{

public static void main(String[] args) {

System.out.println("1.soru");
int a = 1;
System.out.println("a\ta^2\ta^3");
System.out.println(a +" \t" + a + "\t" + a  );
a++;
System.out.println(a + "\t" + a*a + "\t" + a*a*a);
a++;
System.out.println(a + "\t" + a*a  + "\t" + a*a*a);
a++;
System.out.println(a + "\t" + a*a  + "\t" + a*a*a);
System.out.print("\n");

System.out.println("2.soru");
double k1 = (9.5*4.5)-(2.5*3);
double k2 = (45.5-3.5);
System.out.println(k1/k2);
System.out.print("\n");

System.out.print("3.soru");
System.out.print("\n");
double p = 3;
double p1 = 4 * (1 - 1/p + 1/(p+2) - 1/(p+4) + 1/(p+6) - 1/(p+8) );
double p2 = 4 * (1 - 1/p + 1/(p+2) - 1/(p+4) + 1/(p+6) - 1/(p+8) + 1/(p+11) );
System.out.println(p1);
System.out.println(p2);
System.out.print("\n");

System.out.print("4.soru");
double ça = 5.5;
double ala = p2 * ça * ça;
double per = 2.0 * p2 * 5.5;
System.out.print("\n");    
System.out.println(ala);
System.out.println(per);
System.out.print("\n");

System.out.print("5.soru");
System.out.print("\n");
double k=3.4;
double l=50.2;
double m=2.1;
double n=0.55;
double r1=44.5;
double r2=5.9;
double g1=(((r1*n)-(l*r2))/((k*n)-(l*m)));
double g2=(((k*r2)-(r1 *m))/((k*n)-(l*m)));
System.out.println(k+"x+"+l+"y="+r1);
System.out.println(m+"x+"+n+"y="+r2);
System.out.println("X="+g1);
System.out.println("Y="+g2);
double edeger=k*g1+l*g2;
double fdeger=m*g1+n*g2;
System.out.println("e'nin değeri:"+edeger);
System.out.println("f'nin değeri:"+fdeger);
System.out.print("\n");

System.out.print("6.soru");
System.out.print("\n");
System.out.println("Çevirmek istediğiniz fahreheit değerini giriniz");
Scanner input = new Scanner(System.in);
double sa = input.nextDouble();
double fahreheit = ( (9.0/5.0) * sa) + 32.0 ;
System.out.println(sa + "°C =  " + fahreheit +"°F");
System.out.print("\n");

System.out.print("7.soru");
System.out.print("\n");
System.out.println("Çapı giriniz");
double çap = input.nextDouble();
System.out.println("Uzunluğu giriniz");
double uzu = input.nextDouble();
double alan = çap * çap *p2 ;
double cevre = alan * uzu;
System.out.println("Alan= "+ alan + " Çevre = " + cevre);
System.out.print("\n");

System.out.print("8.soru");
System.out.print("\n");
System.out.println("Sayı Giriniz");
int sayı1 = input.nextInt();
if (k1 <1000)
{
int s1 = sayı1 / 100 ;
double s2 = (k1 % 100 ) / 10 ;
int s3 = sayı1 % 10 ;
System.out.println(s1+s2+s3);
}
else
{
System.out.println("1000 den az bir sayı giriniz ");
}
System.out.print("\n");

System.out.print("9.soru");
System.out.print("\n");
System.out.println("Dakika'yı giriniz");
long dk = input.nextLong();
long cy = dk / 525948766;
long cm = dk -  (525948766 * cy) ;
long cd = cm /1440;
long cq = cm -  (1440 * cd) ;
System.out.println(cy + " Yıl " + cd + "Gün" + cq + " Dakika ");
System.out.print("\n");

System.out.print("10.soru");
System.out.print("\n");
System.out.println("Aylık tasarruf tutarını girin");
double tasarruf = input.nextDouble();
double ilkay  = tasarruf * (1.0 + 0.05/12);
double ikiay = (ilkay + tasarruf) * (1.0 + 0.05/12);
double ücay = (ikiay + tasarruf) * (1.0 + 0.05/12);
double dörtay = (ücay + tasarruf) * (1.0 + 0.05/12);
double besay = (dörtay + tasarruf) * (1.0 + 0.05/12);
double altıay = (besay + tasarruf) * (1.0 + 0.05/12);
System.out.println(altıay);
System.out.print("\n");

System.out.print("11.soru");
System.out.print("\n");
System.out.println("Pound cinsinde kilonuzu giriniz");
double kilo = input.nextDouble();
System.out.println("İnch cinsinde boyunuzu giriniz");
double boy = input.nextDouble();
kilo *= 0.45359237;
boy *= 0.0254;
System.out.println(boy);
System.out.println("Vücut kitle endeksiniz:"+kilo/(boy*boy) );
System.out.print("\n");

System.out.print("12.soru");
System.out.print("\n");
System.out.println("İlk nokta için x değeri giriniz");
double ilknoktax = input.nextInt();
System.out.println("İlk nokta için y değeri giriniz");
double ilknoktay = input.nextInt();
System.out.println("İkinci nokta için x değeri giriniz");
double ikincinoktax = input.nextInt();
System.out.println("İkinci nokta için y değeri giriniz");
double ikincinoktay = input.nextInt();
double distance = Math.pow(Math.pow((ilknoktax) - ikincinoktax ,2) + Math.pow(ilknoktay - ikincinoktay,2) , 0.5);
System.out.println(Math.pow(distance,0.5));
System.out.print("\n");

System.out.print("13.soru");
System.out.print("\n");
System.out.print("X1 noktası için bir değer girin");
double x1 = input.nextDouble();
System.out.print("Y1 noktası için bir değer girin");
double y1 = input.nextDouble();
System.out.print("X2 noktası için bir değer girin");
double x2 = input.nextDouble();
System.out.print("Y2 noktası için bir değer girin");
double y2 = input.nextDouble();
System.out.print("X3 noktası için bir değer girin");
double x3 = input.nextDouble();
System.out.print("Y3 noktası için bir değer girin");
double y3 = input.nextDouble();
double t1 = Math.pow(Math.pow(x2 - x1 , 2) + Math.pow(y2 - y1 , 2) , 0.5);
double t2 = Math.pow(Math.pow(x3 - x2 , 2) + Math.pow(y3 - y2 , 2) , 0.5);
double t3 = Math.pow(Math.pow(x1 - x3 , 2) + Math.pow(y1 - y3 , 2) , 0.5);
double s = (t1 + t2 + t3) / 2;
double ucgenalan= Math.pow(s * (s - t1) * (s - t2) * (s - t3) , 0.5);
System.out.println(ucgenalan);
input.close();     
}
} 