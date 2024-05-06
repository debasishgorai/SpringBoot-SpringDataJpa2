package SpringDataJpa.Repository;


import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import SpringDataJpa.entity.Employee;
//@Repository
public interface EmppRepository extends JpaRepository<Employee, Serializable>{


	public List<Employee> findByEmpName(String name);
	public List<Employee> findByEmpSal(Double sal);
	public List<Employee> findByEmpNameAndSal(String name,Double sal);
	public List<Employee> findByEmpSalGreaterThan(Double Sal);
	//public List<Employee> findByEmpSalGreaterThan(double sal);
	public List<Employee> findByEmpSalGreaterThan(double sal);
	@Query("select sal where empname=:name")
	public Double findEnpSalByName(String name);
	@Query(value="select count(*)from emptbl", nativeQuery=true)
	public Integer getCount();


	
	
	
}
              