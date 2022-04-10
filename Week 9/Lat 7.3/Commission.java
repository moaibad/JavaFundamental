/**
 *
 * @author Moaibad
 */
public class Commission extends Hourly{
    private double totalSales;
    private double rateE;
    
    public Commission (String eName, String eAddress, String ePhone,
    String socSecNumber, double rate, double rateE){
        super(eName,eAddress,ePhone,socSecNumber,rate);
        this.rateE = rateE;
    }
    
    public void addSales (double totalSales){
        this.totalSales += totalSales;
    }
    
    @Override
    public double pay()
    {
        double payment = super.pay() + (this.totalSales * rateE / 100);
        totalSales = 0;
        return payment;
    }
    
    @Override
    public String toString()
    {
        String result = super.toString();
        result += "\nTotal Sales: " + totalSales;
        return result;
    }
}
