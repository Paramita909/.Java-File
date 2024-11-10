// Creat three class Calculator, ScCalculator and HybridCalculator and group them into a package.
package calc;

class Caculator {
    public void calculate(int a, int b){
        System.out.println("Your result is: " + a+b);
    }
}
class ScCalculator{
    public void calculate(int a, int b){
        System.out.println("Your result is: " + Math.sin(a+b));
    }
}
class HybridCaculator {
    public void calculate(int a, int b){
        System.out.println("Your result is: " + a+b);
        System.out.println("Your result is: " + Math.sin(a+b));
    }
}
public class Problem {
    public static void main(String[] args) {
        System.out.println("I am main method!");
    }
}