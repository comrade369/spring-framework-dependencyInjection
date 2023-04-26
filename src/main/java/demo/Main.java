package demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// this is application context and other is bean factory.
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
//		Doctor doctor = context.getBean(Doctor.class);
//		doctor.assist();
//		
//		Nurse nurse = context.getBean(Nurse.class);
//		nurse.assist();
//		
//		// another way to access.
//		Nurse nurse2 = (Nurse) context.getBean("nurse");
//		nurse2.assist();
//		
//		// decoupling the object.
//		Staff staff = context.getBean(Doctor.class);
//		staff.assist();
//		
//		Staff staff2 = context.getBean(Nurse.class);
//		staff2.assist();
//		
//		// Adding properties
//		Doctor doctor2 = context.getBean(Doctor.class);
//		System.out.println(doctor2.getQualification());
		
		// annotation based injection
//		Staff staff = context.getBean(Doctor.class);
//		staff.assist();
		
		// java based configuration for injection.
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		Doctor doctor = context.getBean(Doctor.class);
		doctor.assist();
		doctor.setQualification("MBBS");
		System.out.println(doctor);
		

	}

}
