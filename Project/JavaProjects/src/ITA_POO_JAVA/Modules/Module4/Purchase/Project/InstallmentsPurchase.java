package ITA_POO_JAVA.Modules.Module4.Purchase.Project;

public class InstallmentsPurchase extends Purchase{

    int installments;
    double monthlyInterest;

    public InstallmentsPurchase(int value, int installments, double monthlyInterest) {
        super(value);
        this.installments = installments;
        this.monthlyInterest = monthlyInterest;
    }

    @Override
    public double total() {
        return super.total() + jurosCompostos();
    }

    public double jurosCompostos(){
        return super.total() * Math.pow(1 + ( monthlyInterest /100), installments) - super.total();
    }

}
