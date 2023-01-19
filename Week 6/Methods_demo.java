
package Recursion;

public class Methods_demo {
    public static void main(String[] args) {
        greet();
        computeSum(2,5);
        System.out.println(return100());
        System.out.println(getSum(10,2));
    }
    
    public static void greet(){
        System.out.println("Hello!");
    }
    
    public static void computeSum(int x, int y){
        System.out.println(x + y);
    }
    
    public static int return100(){
        return 100;
    }
    
    public static int getSum(int x, int y){
        return x + y;
    }
}
