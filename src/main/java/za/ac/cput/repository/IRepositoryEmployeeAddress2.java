package za.ac.cput.repository;

public interface IRepositoryEmployeeAddress2<E, ID> {
    E create(E e);
    E read(ID id);
    E update(E e);
    boolean delete(ID id);
}
