package org.slsr;

//public abstract class
public final class Employee {

	/**
	 * @param args
	 */
	int empId;
	String empName;
	float amount;
	float bonus;
	
	public Employee(int empId, String empName, float amount){
		
		this.empId = empId;
		this.empName = empName;
		this.amount = amount;
	}
	
	public Employee(){}
	
	public void createEmployee(){
		
		Employee emp1 = new Employee(12, "Deepak", 18.5f);
		Employee[] arr = new Employee[2];
		arr[0] = new Employee();
		arr[1] = new Employee();
		
		int[] intArr = new int[5];
		int[] intArr1 = {10,20,30,40};
		intArr[0] = 12;
		intArr[1] = 13;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	

}
