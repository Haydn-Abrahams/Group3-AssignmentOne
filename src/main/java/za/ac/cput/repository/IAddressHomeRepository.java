/** IAddressHomeRepository.java
 *  This class has the singleton functionality of the program
 * Cebisani Lamani (219104409)
 * 10 June 2023
 */
package za.ac.cput.repository;

import za.ac.cput.domain.AddressHome;
import java.util.*;
public interface IAddressHomeRepository extends IRepositoryAddressHome<AddressHome, String> {
    public Set<AddressHome> getAll();
}
