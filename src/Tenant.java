public class Tenant{
    private String LeaseDetail;
    private String PropertyDetails;
    private String LeaseStatus; 
    private String LeaseTerms;
    
    public Tenant(String leaseDetail, String propertyDetails, String leaseStatus, String leaseTerms) {
        LeaseDetail = leaseDetail;
        PropertyDetails = propertyDetails;
        LeaseStatus = leaseStatus;
        LeaseTerms = leaseTerms;
    }

    public void createRentalContract(){
        
    }
    public void TerminateRentalContract(){

    }
    public String getLeaseDetail() {
        return LeaseDetail;
    }

    public void setLeaseDetail(String leaseDetail) {
        LeaseDetail = leaseDetail;
    }

    public String getPropertyDetails() {
        return PropertyDetails;
    }

    public void setPropertyDetails(String propertyDetails) {
        PropertyDetails = propertyDetails;
    }

    public String getLeaseStatus() {
        return LeaseStatus;
    }

    public void setLeaseStatus(String leaseStatus) {
        LeaseStatus = leaseStatus;
    }

    public String getLeaseTerms() {
        return LeaseTerms;
    }

    public void setLeaseTerms(String leaseTerms) {
        LeaseTerms = leaseTerms;
    }
}