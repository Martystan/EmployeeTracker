package spring.excercise;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import spring.excercise.models.Employee;
import spring.excercise.repositories.EmployeeRepository;

@SpringBootTest
class EmployeeTrackerApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	public void createEmployee(){
		Employee employee1 = new Employee("John Doe", 24,33, "john@employee.com");
		employeeRepository.save(employee1);
	}


}
