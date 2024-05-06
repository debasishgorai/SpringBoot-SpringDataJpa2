package SpringDataJpa7.Repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import SpringDataJpa7.entity.Employee;

public interface EmppRepository extends CrudRepository<Employee, Serializable> {

}
