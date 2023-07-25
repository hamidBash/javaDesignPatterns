package CreationalDesignPattern.abstractfactorypattern;

public class SBI implements Bank{
    private final String BNAME;

    public SBI() {
        this.BNAME = "SBI BANK";
    }

    @Override
    public String getBankName() {
        return BNAME;
    }
}
