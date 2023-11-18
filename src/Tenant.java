import java.util.ArrayList;
import java.util.*;
public class Tenant{
    private String LeaseDetail;
    private String PropertyDetails;
    private String LeaseStatus; 
    private String LeaseTerms;
    private Hashtable<String,RentalContract_Lease>RentalContract_Lease_map=new Hashtable(); 
    public Tenant(String leaseDetail, String propertyDetails, String leaseStatus, String leaseTerms) {
        LeaseDetail = leaseDetail;
        PropertyDetails = propertyDetails;
        LeaseStatus = leaseStatus;
        LeaseTerms = leaseTerms;
    }

    public void createRentalContract(String contractID, String propertyID, String tenantID, String startDate, String endDate, double rentAmount){

      
       RentalContract_Lease_map.put(contractID, new RentalContract_Lease(LeaseDetail, PropertyDetails, LeaseTerms, LeaseStatus, LeaseDetail, 0));
    }
    public void TerminateRentalContract(String contractID){
       RentalContract_Lease_map.remove(contractID);
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