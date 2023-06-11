package za.ac.cput.repository;

import za.ac.cput.domain.EmployeeAddress2;

import java.util.HashSet;
import java.util.Set;

public class EmployeeAddress2Repository implements IEmployeeAddress2Repository{
    private static EmployeeAddress2Repository employeeAddress2Repository = null;
    private Set<EmployeeAddress2> employeeAddress2Set = null;
    private EmployeeAddress2Repository (){employeeAddress2Set = new HashSet<EmployeeAddress2>();}
    public static EmployeeAddress2Repository getEmployeeAddress2Repository(){
        if (employeeAddress2Repository == null){
            employeeAddress2Repository = new EmployeeAddress2Repository();
        }
        return employeeAddress2Repository;
    }

    @Override
    public EmployeeAddress2 create(EmployeeAddress2 employeeAddress2) {
        boolean success = employeeAddress2Set.add(employeeAddress2);
        if (!success)
        return null;
        return employeeAddress2;
    }

    @Override
    public EmployeeAddress2 read(String s) {
        EmployeeAddress2 employeeAddress2 = employeeAddress2Set
                .stream()
                .filter(employeeAddress21 -> employeeAddress21.getAddressHome().equals(s))
                .findAny()
                .orElse(null);
        return employeeAddress2;
    }

    @Override
    public EmployeeAddress2 update(EmployeeAddress2 employeeAddress2) {
        EmployeeAddress2 oldEmployeeAddress = read(employeeAddress2.getAddressHome().getHome_ID());
        if (oldEmployeeAddress != null){
            employeeAddress2Set.remove(oldEmployeeAddress);
            employeeAddress2Set.add(employeeAddress2);
            return employeeAddress2;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        EmployeeAddress2 deleteEmployeeAddress2 = read(s);
        if (deleteEmployeeAddress2 != null){
            employeeAddress2Set.remove(deleteEmployeeAddress2);
            return true;
        }
        return false;
    }
    @Override
    public Set<EmployeeAddress2> getAll() {
        return employeeAddress2Set;
    }
}