package za.ac.cput.factory;

import za.ac.cput.domain.AddressHome;
import za.ac.cput.util.Helper;

public class AddressHomeFactory {
    public static AddressHome addHomeAddress(String street_Address, String complex, String apartment_Number, String suburb, String city, String province, String postal_Code, String country) {
        if (Helper.isNullorEmpty(street_Address) || Helper.isNullorEmpty(complex) || Helper.isNullorEmpty(apartment_Number) || Helper.isNullorEmpty(suburb) || Helper.isNullorEmpty(city) || Helper.isNullorEmpty(province) || Helper.isNullorEmpty(postal_Code) || Helper.isNullorEmpty(country)){
            return null;
        }
        String home_ID = "1";

        return new AddressHome.Builder()
                .setHome_ID(home_ID)
                .setStreet_Address(street_Address)
                .setComplex(complex)
                .setApartment_Number(apartment_Number)
                .setSuburb(suburb)
                .setCity(city)
                .setProvince(province)
                .setPostal_Code(postal_Code)
                .setCountry(country)
                .build();
    }
}
