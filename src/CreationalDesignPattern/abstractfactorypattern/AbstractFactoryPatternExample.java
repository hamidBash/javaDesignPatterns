package CreationalDesignPattern.abstractfactorypattern;

import java.util.Scanner;

public class AbstractFactoryPatternExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of Bank from where you want to take loan amount: ");
        String bankName = scanner.nextLine();

        System.out.println("Enter the type of loan e.g. home loan or business loan or education loan : ");
        String loanType = scanner.nextLine();

        AbstractFactory bankFactory = FactoryCreator.getFactory("BANK");
        Bank bank = bankFactory.getBank(bankName);

        System.out.println("Enter the interest rate for "+bank.getBankName()+ ": ");
        double rate = scanner.nextDouble();

        System.out.println("Enter the loan amount you want to take: ");
        double loanAmount = scanner.nextDouble();

        System.out.println("Enter the number of years to pay your entire loan amount: ");
        int years = scanner.nextInt();

        System.out.println("you are taking the loan from "+ bank.getBankName());

        AbstractFactory loanFactory = FactoryCreator.getFactory("LOAN");
        Loan loan = loanFactory.getLoan(loanType);
        loan.getInterestRate(rate);
        loan.calculateLoanPayment(loanAmount,years);

    }
}
