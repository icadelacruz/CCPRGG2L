
package Recursion;

public class Recursion_demo {
    public static void main(String[] args) {
//      greet(5);
//      checkMoveOn(3);
//        System.out.println(factorial(5));
//        System.out.println(generateSeries(10));
//        System.out.println(computeSum(5));
//        System.out.println(multiplyByAdding(2,5));
//        System.out.println(getPower(3,3));
//        System.out.println(countX("taxxxxx"));
        System.out.println(noX("xxhixx"));
    }
    
    public static void greet(int n){
        //base case
        if(n == 0){
            System.out.println("Done!");
        }
        else{
            System.out.println("Hello!");
            greet(n-1); //recursive call
        }
        
    }
    
    public static void checkMoveOn(int leftYears){
        if(leftYears == 0){
            System.out.println("Finally! Naka-move on ka na!");
        }
        else{
            System.out.println("Nope, not yet. ");
            checkMoveOn(leftYears-1);
        }
    }
    
    public static int factorial(int n){
        if(n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }
    
    public static String generateSeries(int n){
        if(n == 1){
            return 1 + ""; 
        }
        return n + " " + generateSeries(n-1);
        
    }
    
    public static int computeSum(int n){
        if(n == 1){
            return 1;
        }
        return n + computeSum(n - 1);
    }
    
    public static int multiplyByAdding(int x, int y){
        if(y == 0){
            return 0;
        }
        return x + multiplyByAdding(x,y-1);
    }
    
    public static int getPower(int base, int power){
        if(power == 0){
            return 1;
        }
        return base * getPower(base, power-1);
    }
    
    public static int countX(String s){
        if(s.equals("")){
            return 0;
        }
        if(s.charAt(0) == 'x'){
            return 1 + countX(s.substring(1));
        }
        return countX(s.substring(1));
    }
    
    public static String noX(String s){
        if(s.equals("")){
            return "";
        }
        if(s.charAt(0)=='x'){
            return "" + noX(s.substring(1));
        }
        return s.charAt(0) + noX(s.substring(1));
    }
}
