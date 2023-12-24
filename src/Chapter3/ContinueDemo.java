package Chapter3;

public class ContinueDemo {
    public static void main(String args[]) {
        int i = 0;

        while (i < 8) {
            if (i == 0) {
                i++;
                continue; // if i equals 0, 10/i is not printed
            }

            System.out.println(10 + "->" + i);
            
            if (i == 1) {
                i++;
                continue; // skip the next iteration for i=1
            }

            i++;
        }
    }
}

