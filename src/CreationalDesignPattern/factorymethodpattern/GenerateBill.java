package CreationalDesignPattern.factorymethodpattern;

import java.util.Random;
import java.util.Scanner;

public class GenerateBill {
    public static void main(String[] args) {
        GetPlanFactory planFactory = new GetPlanFactory();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of plan for which the bill will be generated: ");
        String planName = scanner.nextLine();
        System.out.print("Enter the number of units for bill will be calculated: ");
        int units = scanner.nextInt();
        Plan plan = planFactory.getPlan(planName);
        System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");
        plan.getRate();
        plan.calculateBill(units);
    }
}
