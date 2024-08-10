package SpringDataJpa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import SpringDataJpa.Repository.EmppRepository;
import SpringDataJpa.Repository.ProductRepository;
import SpringDataJpa.entity.Employee;
import SpringDataJpa.entity.Product;

@SpringBootApplication
public class SpringDataJpa3Application {

	public static void main(String[] args) {
		 ConfigurableApplicationContext context=	SpringApplication.run(SpringDataJpa3Application.class, args);
		  EmppRepository  emppRepository =context.getBean(EmppRepository.class);
		//Employee findByEmpName=  (Employee) emppRepository.findByEmpName("Debbbb");
		//  System.out.println(findByEmpName);
		  
		  List<Employee> findByEmpName=emppRepository.findByEmpName("deb");
		System.out.println(findByEmpName);
		
		  List<Employee> findByEmpsal=emppRepository.findByEmpSal(100.00);
		  System.out.println(findByEmpsal);
		  List<Employee> findByEmpNameAndSal=emppRepository.findByEmpNameAndSal("Suman", 1120.00);
		  System.out.println(findByEmpNameAndSal);

		  List<Employee> findByEmpsalGreaterthan=emppRepository.findByEmpSalGreaterThan(100.00);
		  findByEmpsalGreaterthan.forEach(emp->{
			  System.out.println(emp);
		  });
		  Double salary=emppRepository.findEnpSalByName("deb");
		  System.out.println(salary);
	
}}
