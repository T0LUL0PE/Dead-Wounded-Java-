package my.deadorwounded;

import java.util.Scanner;

/**
 * @author T0LUL0PE
 */
public class Play {
    
    public static void main(String[] args){
    int dead = 0;
     int wounded = 0;
     String value1;
     int k,l,m,n,v,w,x,y;

 System.out.println("Lets Play!");
 System.out.println("Your Call:");

//call the random generator method

int[] j= Action.rerun();
 k = j[0]; l = j[1]; m = j[2]; n = j[3];

Scanner input = new Scanner(System.in);
int q = input.nextInt();
value1 = Integer.toString(q);


if (q < 1000){
v = Character.getNumericValue('0');
w = Character.getNumericValue(value1.charAt(0));
x = Character.getNumericValue(value1.charAt(1));
y = Character.getNumericValue(value1.charAt(2));
}else{
v = Character.getNumericValue(value1.charAt(0));
w = Character.getNumericValue(value1.charAt(1));
x = Character.getNumericValue(value1.charAt(2));
y = Character.getNumericValue(value1.charAt(3));
}

int[] z= new int[4];
z[0] = v; z[1] = w; z[2] = x; z[3] = y;

while(dead<4){
    
for(int s:j){
     if(s==j[0]&&s==z[0]){
         dead++;
     }if(s==j[0]&&(s==z[1]||s==z[2]||s==z[3])){
    wounded++;
}
 }

for(int s:j){
     if(s==j[1]&&s==z[1]){
         dead++;
     }if(s==j[1]&&(s==z[0]||s==z[2]||s==z[3])){
    wounded++;
}
 }
for(int s:j){
     if(s==j[2]&&s==z[2]){
         dead++;
     }if(s==j[2]&&(s==z[0]||s==z[1]||s==z[3])){
    wounded++;
}
 }
for(int s:j){
     if(s==j[3]&&s==z[3]){
         dead++;
     }if(s==j[3]&&(s==z[0]||s==z[1]||s==z[2])){
    wounded++;
}
 }

System.out.println(""+k+""+l+""+m+""+n);
 System.out.println(dead+" dead "+wounded+" wounded");
 
 if(dead==4){
     break;         
 }else{
 
 q = input.nextInt();
value1 = Integer.toString(q);
dead = 0;
wounded = 0;

if (q < 1000){
v = Character.getNumericValue('0');
w = Character.getNumericValue(value1.charAt(0));
x = Character.getNumericValue(value1.charAt(1));
y = Character.getNumericValue(value1.charAt(2));
}else{
v = Character.getNumericValue(value1.charAt(0));
w = Character.getNumericValue(value1.charAt(1));
x = Character.getNumericValue(value1.charAt(2));
y = Character.getNumericValue(value1.charAt(3));
}

z= new int[4];
z[0] = v; z[1] = w; z[2] = x; z[3] = y;
}
}
}
}
