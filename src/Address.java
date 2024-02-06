public class Address {
    private String district;
    private String street;
    private int streetNumber;

    public int getStreetNumber() {
        return streetNumber;
    }
    public void setStreetNumber(int streetNumber){
        this.streetNumber= streetNumber;
    }

    public String getDistrict(){
        return district;
    }
    public void setDistrict(String district){
        this.district= district;
    }

    public String getStreet(){
        return street;
    }
    public void setStreet(String street){
        this.street= street;
    }

    public String toString(){
        return streetNumber+ " " +street+", "+district;
    }


}
