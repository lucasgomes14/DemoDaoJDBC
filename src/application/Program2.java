package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("===== TEST 1: dapartment findById =====");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		System.out.println("\n===== TEST 2: department findAll =====");
		List<Department> list = departmentDao.findAll();
		
		for(Department e : list) {
			System.out.println(e);
		}
		
		System.out.println("\n===== TEST 3: department insert =====");
		Department newDep = new Department(null, "Music");
		departmentDao.insert(newDep);
		System.out.println("Inserted! new id = " + newDep.getId());
		
		System.out.println("\n===== TEST 4: department update =====");
		dep = departmentDao.findById(1);
		dep.setName("Music3");
		departmentDao.update(dep);
		System.out.println("Update completed!");
	}

}
