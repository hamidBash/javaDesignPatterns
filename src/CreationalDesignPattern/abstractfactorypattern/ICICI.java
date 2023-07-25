package CreationalDesignPattern.abstractfactorypattern;

public class ICICI implements Bank{
    private final String BNAME;

    public ICICI() {
        this.BNAME = "ICICI BANK";
    }

    @Override
    public String getBankName() {
        return BNAME;
    }
}
