package SpringDataJpa7.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import SpringDataJpa7.entity.Employee;
import SpringDataJpa7.entity.EmployeeOne;
@Repository
public interface EmppOneRepository extends JpaRepository<EmployeeOne, Serializable> {

}
