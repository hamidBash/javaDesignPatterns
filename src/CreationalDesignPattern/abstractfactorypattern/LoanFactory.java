package CreationalDesignPattern.abstractfactorypattern;

public class LoanFactory extends AbstractFactory{

    @Override
    public Bank getBank(String bankName) {
        return null;
    }

    @Override
    public Loan getLoan(String loanType) {
        if(loanType == null)
            return null;
        else if(loanType.equalsIgnoreCase("Business"))
            return new BussinessLoan();
        else if (loanType.equalsIgnoreCase("Education"))
            return new EducationLoan();
        else if (loanType.equalsIgnoreCase("Home"))
            return new HomeLoan();
        return null;
    }
}
