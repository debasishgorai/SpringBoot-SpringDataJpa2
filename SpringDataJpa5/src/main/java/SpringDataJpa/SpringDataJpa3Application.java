package SpringDataJpa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;

import SpringDataJpa.Repository.EmppRepository;
import SpringDataJpa.Repository.ProductRepository;
import SpringDataJpa.entity.Employee;
import SpringDataJpa.entity.Product;

@SpringBootApplication
public class SpringDataJpa3Application {

	public static void main(String[] args) {
		 ConfigurableApplicationContext context=	SpringApplication.run(SpringDataJpa3Application.class, args);
		  EmppRepository  emppRepository =context.getBean(EmppRepository.class);
		 
		  Employee emp=new Employee(null, null, 0);
		//  emp.getEmpid(1);
		  Example<Employee>empExampl=Example.of(emp);
		  List<Employee>findAll=emppRepository.findAll(empExampl);
		  for(Employee e: findAll) {
			  System.out.println(e);
		  }
		  
}}
