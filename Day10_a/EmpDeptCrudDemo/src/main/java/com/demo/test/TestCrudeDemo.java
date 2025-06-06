package com.demo.test;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.model.Department;
import com.demo.model.Employee;
import com.demo.service.DepartmentService;
import com.demo.service.DepartmentServiceImpl;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestCrudeDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeService eservice=new EmployeeServiceImpl();
		DepartmentService dservice=new DepartmentServiceImpl();
		int choice=0;
		do {
			System.out.println("1.Add new Employee\n2. Add new Department\n3. Delete department\n");
			System.out.println("4.Delete Employee\n5. modify department\n6. modify employee\n");
			System.out.println("7.Display employee by id \n8. Display department by id\n9. Display all departments\n");
			System.out.println("10.Display all Employees\n11. display employees in sorted order\n12. exit\n");
			System.out.println("Choice : ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				eservice.addNewEmployee();
				break;
			case 2:
				dservice.addNewDepartment();
				break;
			case 3:
				System.out.println("enetr department no to delete");
				int deptno=sc.nextInt();
				boolean status=dservice.deleteDeptById(deptno);
				if(status) {
					System.out.println("Department deleted successfully");
				}else {
					System.out.println("not found");
				}
				
				break;
			case 4:
				System.out.println("enetr Employee no to delete");
				int empno=sc.nextInt();
				status=eservice.deleteEmpById(empno);
				if(status) {
					System.out.println("Employee deleted successfully");
				}else {
					System.out.println("not found");
				}
				break;
			case 5:
				System.out.println("enetr departmentno");
				 deptno=sc.nextInt();
				System.out.println("enetr departmentname");
				String dname=sc.next();
				System.out.println("enetr department loc");
				String loc=sc.next();
				 status=dservice.updateDepartment(deptno,dname,loc);
				if(status) {
					System.out.println("Department updated");
				}else {
					System.out.println("not found");
				}
		
				break;
			case 6:
				System.out.println("enter empno");
				 empno=sc.nextInt();
				System.out.println("enetr name");
				String ename=sc.next();
				System.out.println("enetr salary");
				double sal=sc.nextDouble();
				 status=eservice.updateEmployee(empno,ename,sal);
				if(status) {
					System.out.println("Employee updated");
				}else {
					System.out.println("not found");
				}
				break;
			case 7:System.out.println("enter employee id");
				int id=sc.nextInt();
				Employee emp=eservice.getEmpById(id);
				if(emp!=null) {
					System.out.println(emp);
				}else {
					System.out.println("not found");
				}
				break;
			case 8:System.out.println("enter department id");
			 	id=sc.nextInt();
			 	Department d=dservice.getDeptById(id);
				if(d!=null) {
					System.out.println(d);
				}else {
					System.out.println("not found");
				}
				break;
				
			case 9:
				List<Department> dset=dservice.getAllDepartments();
				dset.forEach(System.out::println);
				break;
			case 10:
				List<Employee> elist=eservice.getAllEmployees();
				elist.forEach(System.out::println);
				break;
			case 11:
				elist=eservice.sortedEmployees();
				elist.forEach(System.out::println);
				break;
			case 12:
				eservice.closeConnection();
				sc.close();
				System.out.println("Thank you for visiting .....");
				break;
			default:
				System.out.println("wrong choice");
				break;
			}
		}while(choice!=12);

	}

}
