package SpringDataJpa7.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringDataJpa7.entity.InsurancePlan;

@Service
public class Insurance {
	@Autowired
private Insurance repo;
	
	public   void saveplan() {
		//@Autowired
		
		
		
		
		
		InsurancePlan e1=new InsurancePlan();
	//e1.setPlanId(44);
	e1.setPlanName("jjjj");
	e1.setPlanStatus("aoorived");
	repo.
//		e1.setCreatedDate(null);
//		e1.setUpdatedDate(null);
	}
}
