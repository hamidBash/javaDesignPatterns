package CreationalDesignPattern.abstractfactorypattern;

public class HDFC implements Bank{
    private final String BNAME;

    public HDFC() {
        this.BNAME = "HDFC BANK";
    }

    @Override
    public String getBankName() {
        return BNAME;
    }
}
