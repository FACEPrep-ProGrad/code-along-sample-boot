package springbootsamplehr.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springbootsamplehr.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
