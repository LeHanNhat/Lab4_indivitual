
import java.util.Hashtable;

public class Property {
    private String PropertyID;
    private String Description;
    private double RentalRate;
    public Hashtable<String,Property> map =new Hashtable<>();
    public Property(String propertyID, String description, double rentalRate) {
        this.PropertyID = propertyID;
        this.Description = description;
        this.RentalRate = rentalRate;
    }
    

    

    public String getPropertyID() {
        return PropertyID;
    }
    
    public String getDescription() {
        return Description;
    }
    public String setDescription(String description) {
        return this.Description=description;
    }
    public double getRentalRate() {
        return RentalRate;
    }
    public double setRentalRate(double rentalRate) {
        return this.RentalRate=rentalRate;
    }
    public void CreateProperty(String propertyID, Property property) {
        map.put(propertyID, property);
    }
    public void UpgradeProperty(String propertyID, String description, double rentalRate) {
        if(map.containsKey(propertyID)) {
           map.get(propertyID).setDescription(description);
           map.get(propertyID).setRentalRate(rentalRate);          
        } else {
            System.out.println("No infomation");
        }
    }
    public void DeleteProperty(String id){
        map.remove(id);
    }

    

}
