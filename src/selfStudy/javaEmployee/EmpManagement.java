package selfStudy.javaEmployee;

import java.util.ArrayList;

public class EmpManagement {
	
	private ArrayList al = null;
	
	public EmpManagement() {
		al = new ArrayList();
	}
	
	public void addEmp(Emp emp) {
		al.add(emp);
	}
	
	public void showInfo(String empNo) {
		for(int i = 0; i < al.size(); i++) {
			Emp emp =(Emp)al.get(i);
			
			if(emp.getEmpNo().equals(empNo)) {
				System.out.println("Employee info: ");
				System.out.println("Employee#: " + empNo);
				System.out.println("Name: " + emp.getName());
				System.out.println("Salary: " + emp.getSalary());
				
			}
		}
	}
	
	public void updateSalary(String empNo, float newSalary) {
		for(int i = 0; i < al.size(); i++ ) {
			Emp emp = (Emp)al.get(i);
			if(emp.getEmpNo().equals(empNo)) {
				emp.setSalary(newSalary);
			}
		}
	}

	public void delEmp(String empNo) {
		for(int i = 0; i < al.size(); i++) {
			Emp emp = (Emp)al.get(i);
			if(emp.getEmpNo().equals(empNo)) {
				al.remove(i);
			}
		}
	}

	
}
