package my.deadorwounded;
import java.util.Random;
/**
 * @author T0LULOPE
 */
public class Action {
    //class for 4-digit number generation
    public static int[] rerun(){
Create o;
        
o = new Create();
int p[] = Create.value();
if (((p[1]==p[0]||p[3]==p[0]))||((p[0]==p[2]||p[3]==p[2]))||((p[3]==p[1]||p[2]==p[1]))){
do{
 o = new Create();
 p = o.value();
}
while(((p[1]==p[0]||p[3]==p[0]))||((p[0]==p[2]||p[3]==p[2]))||((p[3]==p[1]||p[2]==p[1])));
}
return p;}
    
    public static  class Create{
public static int[] value(){
String number;
Random random = new Random();
  int answer = random.nextInt(10000);
number = Integer.toString(answer);
int e,f,g,h;

if(answer < 1000){
 e = Character.getNumericValue('0');
f = Character.getNumericValue(number.charAt(0));
g = Character.getNumericValue(number.charAt(1));
h = Character.getNumericValue(number.charAt(2));
}else{
 e = Character.getNumericValue(number.charAt(0));
 f = Character.getNumericValue(number.charAt(1));
g = Character.getNumericValue(number.charAt(2));
h = Character.getNumericValue(number.charAt(3));
}
//An array containing each digit of the random number
int i[]= new int[4];
i[0] = e; i[1] = f; i[2] = g; i[3] = h;
return i;
}}
}
