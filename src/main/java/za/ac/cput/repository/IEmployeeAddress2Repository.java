package za.ac.cput.repository;

import za.ac.cput.domain.EmployeeAddress2;

import java.util.Set;

public interface IEmployeeAddress2Repository extends IRepositoryEmployeeAddress2<EmployeeAddress2, String>{
    public Set<EmployeeAddress2> getAll();
}
