package Chapter3;

public class NestedLoopPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i += 2) {
            for (int j = i; j <= 7; j += 2) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

