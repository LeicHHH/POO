public class Buzz {
	
public static void baffle(String blimp) {
System.out.println(blimp);//4°
zippo("ping", -5);//5°
}

public static void zippo(String quince, int flag) {
if (flag < 0) {
System.out.println(quince + " zoop");//6°
} else {
System.out.println("ik");//2°
baffle(quince);//3°
System.out.println("boo-wa-ha-ha");//7°
}}


public static void main(String[] args) {
zippo("rattle", 13); // 1°
}

}

//3.-El valor de blimp cuando baffle es invocado es "rattle" 
//4.- El output es:
//   ik
//   rattle
//   ping zoop
//   boo-wa-ha-ha
