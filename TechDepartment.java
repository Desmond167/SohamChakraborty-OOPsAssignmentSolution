//package week2.coding.assignment;

//======= The Child Class(or Derived Class) =======//
class TechDepartment extends SuperDepartment{
	
	//======= Member Function to return Department Name =======//
	String departmentName() {
		//_______ Variable storing Department Name _______//
		String msg = "Tech Department";
		//_______ Return message _______//
		return msg;
	}
	
	//======= Member Function to return Work =======//
	String getTodaysWork() {
		//_______ Variable storing Work _______//
		String msg = "Complete coding of module 1";
		//_______ Return message _______//
		return msg;
	}
	
	//======= Member Function to return Work Deadline =======//
	String getWorkDeadline() {
		//_______ Variable storing Work Deadline _______//
		String msg = "Complete by EOD";
		//_______ Return message _______//
		return msg;
	}
	
	//======= Member Function to return Stack Information =======//
	String getTechStackInformation() {
		//_______ Variable storing Stack Information _______//
		String msg = "core Java";
		//_______ Return message _______//
		return msg;
	}
}
