import java.util.*;
import java.io.*;

public class Property_Owner {
    public  StringBuffer sb = new StringBuffer(); 
    private ArrayList<Property> propertyOwned;
    private String legalStatus;
    private ArrayList<String> paymentHistory;

    private Property property;
    
    public Property_Owner(ArrayList<Property> propertyOwned, String legalStatus, ArrayList<String> paymentHistory) {
        this.propertyOwned = propertyOwned;
        this.legalStatus = legalStatus;
        this.paymentHistory = paymentHistory;
    }

    public void ListProperty() {
        for (int i = 0;i<this.propertyOwned.size();i++) {
            sb.append(this.propertyOwned.get(i)).append("\n");
        }
        System.out.println(sb);
    }
    public void CreateProperty(String propertyID, Property property2) {
        property.CreateProperty(propertyID,property2);
        propertyOwned.add(property);
    }

    public void updatePropertyOwned(int id, Property property3) {
        propertyOwned.get(id).UpgradeProperty(property3.getPropertyID(), property3.getDescription(), property3.getRentalRate());
    }
    public void DeleteProperty(int id,String propertyID){
        propertyOwned.get(id).DeleteProperty(propertyID);
    }
}