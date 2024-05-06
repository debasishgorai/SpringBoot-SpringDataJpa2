package SpringDataJpa7.Service;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;
import org.springframework.stereotype.Service;

import SpringDataJpa7.Repository.AddressRepository;
import SpringDataJpa7.Repository.AddressRepository;
import SpringDataJpa7.Repository.EmppRepository;
import SpringDataJpa7.entity.Address;
import SpringDataJpa7.entity.Employee;
import SpringDataJpa7.entity.EmployeeOne;
import jakarta.transaction.Transactional;



@Service
public class EmployeeService {

	//@Autowired
	private EmppRepository empRepo;
	//@Autowired
	//private EmployeeOne emponeRepo;
	//@Autowired
	private AddressRepository addr;
	@Autowired
	public EmployeeService(EmppRepository empRepo, AddressRepository addr) {
		super();
		this.empRepo = empRepo;
		this.addr = addr;
	}
	public EmppRepository getEmpRepo() {
		return empRepo;
	}
	@Autowired
	public void setEmpRepo(EmppRepository empRepo) {
		this.empRepo = empRepo;
	}
	public AddressRepository getAddr() {
		return addr;
	}
	@Autowired
	public void setAddr(AddressRepository addr) {
		this.addr = addr;
	}
	@Transactional(rollbackOn =Exception.class )
	public void saveData() {
		Employee emp=new Employee();
		emp.setEmpid(33);
		emp.setEmpName("Mahya Amit");
		emp.setEmpSal(500.00);
		
		
		empRepo.save(emp);
		
		//int i=10/0;
 Address add = new Address();
 add.setAddid(9);
 add.setCity("baleswarur");
 add.setEmpid(33);
 add.setPincode(851565555);
 add.setState("odishaBh");
            addr.save(add);
 
 
 
 
	}
//		EmployeeOne e1=new EmployeeOne();
//		e1.setEmpid(100);
//		e1.setEmpName("Sinu");
//		e1.setEmpSal(55555);
//		emponeRepo.save(e1);
	
	//	public void SaveData1() {
			
		
	
		
		
	//}
	
	}
