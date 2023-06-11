/** AddressHome.java
 * This is a POJO class
 * This class is immutable (objects should not be changed)
 * Cebisani Lamani (219104409)
 * 10 June 2023
 * */
package za.ac.cput.domain;

public class AddressHome {

    private String home_ID;
    private String street_Address;
    private String complex; //complex/building
    private String apartment_Number;
    private String suburb;
    private String city;
    private String province;
    private String postal_Code;
    private String country;

    protected AddressHome(){}
    // Builder Constructor
    public AddressHome(Builder builder){
        this.home_ID = builder.home_ID;
        this.street_Address = builder.street_Address;
        this.complex = builder.complex;
        this.apartment_Number = builder.apartment_Number;
        this.suburb = builder.suburb;
        this.city = builder.city;
        this.province = builder.province;
        this.postal_Code = builder.postal_Code;
        this.country = builder.country;
    }

    public String getHome_ID() { return home_ID; }

    public String getStreet_Address() {
        return street_Address;
    }

    public String getComplex() {
        return complex;
    }

    public String getApartment_Number() {
        return apartment_Number;
    }

    public String getSuburb() {
        return suburb;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    public String getPostal_Code() {
        return postal_Code;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "AddressHome{" +
                "home_ID='" + home_ID + '\'' +
                ", street_Address='" + street_Address + '\'' +
                ", complex='" + complex + '\'' +
                ", apartment_Number='" + apartment_Number + '\'' +
                ", suburb='" + suburb + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", postal_Code='" + postal_Code + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public static class Builder{
        private String home_ID;
        private String street_Address;
        private String complex; //complex/building
        private String apartment_Number;
        private String suburb;
        private String city;
        private String province;
        private String postal_Code;
        private String country;


        public Builder setHome_ID(String home_ID) {
            this.home_ID = home_ID;
            return this;
        }

        public Builder setStreet_Address(String street_Address) {
            this.street_Address = street_Address;
            return this;
        }

        public Builder setComplex(String complex) {
            this.complex = complex;
            return this;
        }

        public Builder setApartment_Number(String apartment_Number) {
            this.apartment_Number = apartment_Number;
            return this;
        }

        public Builder setSuburb(String suburb) {
            this.suburb = suburb;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setProvince(String province) {
            this.province = province;
            return this;
        }

        public Builder setPostal_Code(String postal_Code) {
            this.postal_Code = postal_Code;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }
        public Builder copy(AddressHome addressHome){
            this.home_ID = addressHome.home_ID;
            this.street_Address = addressHome.street_Address;
            this.complex = addressHome.complex;
            this.apartment_Number = addressHome.apartment_Number;
            this.suburb = addressHome.suburb;
            this.city = addressHome.city;
            this.province = addressHome.province;
            this.postal_Code = addressHome.postal_Code;
            this.country = addressHome.country;
            return this;
        }
        public AddressHome build(){return new AddressHome(this);}
    }
}
