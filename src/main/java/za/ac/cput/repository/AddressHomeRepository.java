package za.ac.cput.repository;

import za.ac.cput.domain.AddressHome;

import java.util.HashSet;
import java.util.Set;

public class AddressHomeRepository implements IAddressHomeRepository{
    private static AddressHomeRepository addressHomeRepository = null;
    private Set<AddressHome> addressHomeSet = null;

    private AddressHomeRepository(){addressHomeSet = new HashSet<AddressHome>();}

    public static AddressHomeRepository getAddressHomeRepository(){
        if (addressHomeRepository == null) {
            addressHomeRepository = new AddressHomeRepository();
        }
        return addressHomeRepository;
    }


    @Override
    public AddressHome create(AddressHome addressHome) {
        boolean success = addressHomeSet.add(addressHome);
        if (!success)
        return null;
        return addressHome;
    }

    @Override
    public AddressHome read(String s) {
        AddressHome addressHome = addressHomeSet.stream()
                                .filter(addressHome1 -> addressHome1.getHome_ID().equals(s))
                                .findAny()
                                .orElse(null);
        return addressHome;
    }

    @Override
    public AddressHome update(AddressHome addressHome) {
        AddressHome oldAddressHome = read(addressHome.getHome_ID());
        if (oldAddressHome !=null){
            addressHomeSet.remove(oldAddressHome);
            addressHomeSet.add(addressHome);
            return addressHome;
        }
        return null;
    }

    @Override
    public boolean delete(String home_ID) {
        AddressHome addressHomeDelete = read(home_ID);
        if (addressHomeDelete != null){
            addressHomeSet.remove(addressHomeDelete);
            return true;
        }
        return false;
    }


    @Override
    public Set<AddressHome> getAll() {
        return addressHomeSet;
    }
}
