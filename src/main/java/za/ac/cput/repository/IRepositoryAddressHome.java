/** IRepositoryAddressHome.java
 *  This class has the singleton functionality of the program
 * Cebisani Lamani (219104409)
 * 10 June 2023
 */
package za.ac.cput.repository;

public interface IRepositoryAddressHome<E, ID> {
    E create(E e);
    E read(ID id);
    E update(E e);
    boolean delete(ID id);

}
