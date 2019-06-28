package my.deadorwounded;

import java.util.Scanner;

/**
 * @author T0LUL0PE
 */
public class Play {
static String o,t;
static int dead = 0;
static int wounded = 0;
static int guesses_left = 8;
static boolean p = true;
static int[] j,z;
static char[] u;
static int i,k,l,m,n,q,v,w,x,y;
static Scanner input;
    
    public static void main(String[] args){
    try{

 System.out.println("Lets Play!");
 System.out.println("Your Call:"+"           Guesses Left:"+guesses_left);

//call the random generator method
j= Action.rerun();
 k = j[0]; l = j[1]; m = j[2]; n = j[3];

input = new Scanner(System.in);
q = input.nextInt();

//check if user's input is a Three-digit number
o = Integer.toString(check(q));
   if (q > 100 && q < 1000){
v = Character.getNumericValue('0');
w = Character.getNumericValue(o.charAt(0));
x = Character.getNumericValue(o.charAt(1));
y = Character.getNumericValue(o.charAt(2));
}else{
v = Character.getNumericValue(o.charAt(0));
w = Character.getNumericValue(o.charAt(1));
x = Character.getNumericValue(o.charAt(2));
y = Character.getNumericValue(o.charAt(3));
}
//input to an array
z= new int[4];
z[0] = v; z[1] = w; z[2] = x; z[3] = y;
//loop to guess until correct
while(dead<4){
    
for(int s:j){
     if(s==j[0]&&s==z[0]){
         dead++;
     }if(s==j[0]&&(s==z[1]||s==z[2]||s==z[3])){
    wounded++;}
if(s==j[1]&&s==z[1]){
         dead++;}
if(s==j[1]&&(s==z[0]||s==z[2]||s==z[3])){
    wounded++;}
if(s==j[2]&&s==z[2]){
         dead++;}
if(s==j[2]&&(s==z[0]||s==z[1]||s==z[3])){
    wounded++;}
if(s==j[3]&&s==z[3]){
         dead++;
}if(s==j[3]&&(s==z[0]||s==z[1]||s==z[2])){
    wounded++;
}}
//clues
 System.out.println("....."+dead+" dead "+wounded+" wounded.....");
 //checl if user's input matches or guess exhausted
if(dead==4||guesses_left==0){
     if(dead==4){
System.out.println("YOU WIN!!");}
    if(guesses_left==0){
System.out.println("YOU LOSE(..guess exhausted)");}
    if(dead==4&&guesses_left==0){
System.out.println("YOU WIN!!");}
     break;         
}else{
 guesses_left--;
System.out.println("Your Call:"+"           Guesses Left:"+guesses_left);
dead = 0;
wounded = 0;
p = true;
q = input.nextInt();
o = Integer.toString(check(q));
if (q > 100 && q < 1000){
v = Character.getNumericValue('0');
w = Character.getNumericValue(o.charAt(0));
x = Character.getNumericValue(o.charAt(1));
y = Character.getNumericValue(o.charAt(2));
}else{
v = Character.getNumericValue(o.charAt(0));
w = Character.getNumericValue(o.charAt(1));
x = Character.getNumericValue(o.charAt(2));
y = Character.getNumericValue(o.charAt(3));
}
//input to an array
z= new int[4];
z[0] = v; z[1] = w; z[2] = x; z[3] = y;
}
}
}catch(Exception ex ){
    System.out.println("An Error Occured.");
}}
//check method   
    public static int check(int r){        
 //check if user's input is a Two-digit number or less
if(r < 100){
    p = true;
System.out.println("Please enter a four-digit number.");
System.out.println("Your Call:");
    r = input.nextInt();
check(r);
if(p==true){
    check(r);
}}
//check if user's input is a Five-digit number or more
else if(r > 9999){
System.out.println("Please enter a zour-digit number.");
    p = true;
System.out.println("Your Call:");
    r = input.nextInt();
    check(r);
if(p==true){
    check(r);
}}
//check if two or more digits are the same
else if (r > 100 && r < 10000){
    i = 0;
if (r > 100 && r < 1000){
t = '0'+Integer.toString(r);}
else if(r > 1000 && r < 10000){
t = Integer.toString(r);}
u = t.toCharArray();
        for(int s:u){
if(s==u[0]&&(s==u[1]||s==u[2]||s==u[3])){
    i++;}
if(s==u[1]&&(s==u[0]||s==u[2]||s==u[3])){
    i++;}
if(s==u[2]&&(s==u[0]||s==u[1]||s==u[3])){
    i++;}
if(s==u[3]&&(s==u[0]||s==u[1]||s==u[2])){
    i++;}}

if(i==0){
    p = false;
}else{
    p = true;
    System.out.println("Two or more digts can't be the same.");
System.out.println("Your Call:");
r =input.nextInt();}
if(p==true){
    check(r);
}}else{
    q = r;
}
return q;}
}
