package SpringDataJpa7.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

//import SpringDataJpa7.entity.Employee;
import SpringDataJpa7.entity.InsurancePlan;
public interface InsurancePlans extends JpaRepository<InsurancePlans, Serializable >{

}
