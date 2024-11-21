
import java.util.Scanner;
class Main {
    public static final Scanner key=new Scanner(System.in);
public static void main(String a[]){
rectangle rect1= new rectangle(5,6);
System.err.println(rect1);
System.err.println(" la surface de rectangle est " + rect1.surface());
String s1="rouge";
String s2="rou";
String s3= s2 + "g";
if (s1.equals(s3)){
    System.err.println("les deux chaines sont identiques");

}
else { System.err.println("les deux chaines ne sont pas identiques");}
    rectangle rect2=new rectangle(5,6);
    System.err.println(rect2.equals(rect1));
    rect1.affiche();
}}
