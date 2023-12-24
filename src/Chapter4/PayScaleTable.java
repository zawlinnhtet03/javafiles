package Chapter4;

public class PayScaleTable {
    public static void main(String args[]) {
        double[][] payScaleTable = {
                {10.50, 12.00, 14.50, 16.75, 18.00},
                {20.50, 22.25, 24.00, 26.25, 28.00},
                {34.00, 36.50, 38.00, 40.35, 43.00},
                {50.00, 60.00, 70.00, 80.00, 99.99}
        };

        double sum = 0.0, average;
        for (int j = 0; j < 5; j++) {
            sum += payScaleTable[2][j];
        }
        average = sum / 5;
        System.out.println("Average of Level 2 Employees: " + average);
        System.out.println("\n");

        double difference;
        for (int i = 0; i < 4; i++) {
            difference = payScaleTable[i][4] - payScaleTable[i][0];
            System.out.println("Pay difference at Grade Level " + i + " is " + difference);
        }
        System.out.println("\n");

        for (int i = 0; i < payScaleTable.length; i++) {
            for (int j = 0; j < payScaleTable[i].length; j++) {
                System.out.print(payScaleTable[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }
}

