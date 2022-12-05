
import java.util.Scanner;

public class Review {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
//        double radius = in.nextDouble();
//        double area = Math.PI * Math.pow(radius, 2);
//        System.out.println("Area of the circle: "+area);
        
//        double value = (8+4/2)+(7%2)*(1*3);
//        System.out.println(value);

//          int x = 5;
//          int new_x = x++;
//          System.out.println("Updated x: "+x);
//          System.out.println(new_x);

            // What makes Person_A happy?
//            boolean gym = true;
//            boolean ate = true;
//            boolean sleepless = true;
//            
//            boolean happy = true;
//            if(gym && ate || !sleepless){
//                happy = true;
//            }
//            else if(gym && ate && sleepless){
//                happy = false;
//            }
//            System.out.println(happy);

//        int age = 20;
//        
//        if(age < 18){
//          System.out.println("You are not allowed to vote");
//          System.out.println("You are below age limit");
//        }
//        boolean registered = true;
//        if(age >= 18){
//            if(registered){
//                System.out.println("You can vote.");
//            }
//            else{
//                System.out.println("You cannot vote.");
//            }
//            //multiple statements
//        }
//        else{
//            System.out.println("You cannot vote.");
//        }
//        int in5to8 = in.nextInt();
//        switch(in5to8){
//            case 5: System.out.println("In the range");
//                    break;
//            case 6: System.out.println("In the range");
//                    break;
//            case 7: System.out.println("In the range");
//                    break;
//            case 8: System.out.println("In the range");
//                    break;
//            default: System.out.println("Out of range");
//                    break;
//        }
        // task: compute for the running sum of the first 5 natural numbers
//        int n = 1;
//        int sum = 0;
//        while(n <= 5){
//            sum += n;
//            System.out.println(sum);
//            n++;
//        }
//        System.out.println("Sum: "+sum);
        // Print "I love Pandas" for 5 times (at least once)
        int n = 5;
        do{
            System.out.println("I love Pandas");
            n--;
        }
        while(n > 0);
        
        System.out.println("------");
        for(int i = 0; i < 5; i++){
            System.out.println("I love Pandas");
        }
    }
}
