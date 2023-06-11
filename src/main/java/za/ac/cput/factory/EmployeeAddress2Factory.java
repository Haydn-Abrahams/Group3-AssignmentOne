/** EmployeeAddressFactory.java
 *  This class sets the factory functionality of the program
 * Cebisani Lamani (219104409)
 * 11 June 2023
 */
package za.ac.cput.factory;

import za.ac.cput.domain.AddressHome;
import za.ac.cput.domain.Employee;
import za.ac.cput.domain.EmployeeAddress2;

public class EmployeeAddress2Factory {
    public static EmployeeAddress2 createEmployeeAddress(Employee employee_ID, AddressHome addressHome){

        return new EmployeeAddress2.Builder()
                   .setEmployee_ID(employee_ID)
                   .setAddressHome(addressHome)
                   .build();
    }
}
