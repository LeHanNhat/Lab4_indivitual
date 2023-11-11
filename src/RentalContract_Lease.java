
public class RentalContract_Lease {
    private String contractID;
    private String propertyID;
    private String tenantID;
    private String startDate;
    private String endDate;
    private Double rentAmount;

    public RentalContract_Lease(String contractID, String propertyID, String tenantID, String startDate, String endDate, double rentAmount){
        this.contractID = contractID;
        this.propertyID = propertyID;
        this.tenantID = tenantID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.rentAmount = rentAmount;
    }
 
    public void setEndDate(String endDate){
        this.endDate = endDate;
    }

    public String getContractID(){
        return this.contractID;
    }

    public String getPropertyID(){
        return this.propertyID;
    }

    public String getTenantID(){
        return this.tenantID;
    }

    public String getStartDate(){
        return this.startDate;
    }

    public String getEndDate(){
        return this.endDate;
    }

    public double getRentAmount(){
        return this.rentAmount;
    }
}
