package demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(scopeName = "singleton")
@Scope(scopeName = "prototype")
public class Doctor implements Staff, BeanNameAware {
	
	private String qualification;
	
//	public Doctor(String qualification) {
//		super();
//		this.qualification = qualification;
//	}

	@Override
	public String toString() {
		return "Doctor [qualification=" + qualification + "]";
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	// taking class 
//	private Nurse nurse;
//
//	public Nurse getNurse() {
//		return nurse;
//	}
//
//	public void setNurse(Nurse nurse) {
//		this.nurse = nurse;
//	}

	public void assist() {
		System.out.println("Doctor is assisting");
	}

	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("set Bean name method is called");
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("Post construct method is called");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("Pre destory method is called");
	}

}
