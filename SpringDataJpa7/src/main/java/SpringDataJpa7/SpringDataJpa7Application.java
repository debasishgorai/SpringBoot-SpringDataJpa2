package SpringDataJpa7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import SpringDataJpa7.Service.EmployeeService;

//.EmployeeService;
//import SpringDataJpa7.Service.EmployeeService;
@SpringBootApplication
public class SpringDataJpa7Application {

	public static void main(String[] args) {
		 ConfigurableApplicationContext context=	SpringApplication.run(SpringDataJpa7Application.class, args);
		EmployeeService service=context.getBean(EmployeeService.class);
		service.saveData();
		
		
		
		context.close();
		
		
		
		
		
		
		
		
	}

}
