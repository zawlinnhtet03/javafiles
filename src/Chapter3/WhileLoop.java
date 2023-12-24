package Chapter3;

public class WhileLoop {
    public static void main(String args[]) {
        int value = 6, factorial = 1, temp;
        temp = value;
        
        while (temp > 0) {
            factorial *= temp--;
        }
        
        System.out.println(value + "!=" + factorial);
    }
}
