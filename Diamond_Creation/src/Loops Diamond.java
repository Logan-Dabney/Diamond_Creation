import java.util.Scanner;

class Diamond {
    public static void main(String args[]){
        int x, y, size;
        Scanner stdin = new Scanner(System.in);
        System.out.println("Please enter an odd number between 1 and 20 :  ");
        size = stdin.nextInt();
        
        while (size<1 || size>20 || size%2==0){
            System.out.println("Please enter an odd number between 1 and 20: ");
            size = stdin.nextInt();
        }
        for (int i=1; i<=size; i=i+2){
            x=1;
            while(x<=((size-i)/2)+1){
                System.out.print(" ");
                x++;}
            y=1;
            while(y<=i){
                System.out.print("X");
                y++;}
            System.out.println();
         }     
        for (int i=(size-2); i>=1; i=i-2){
            x=1;
            while(x<=(size-i)/2+1){
                System.out.print(" ");
                x++;}
            y=1;
            while(y<=i){
                System.out.print("X");
                y++;}
            System.out.println();}
        }
 }
