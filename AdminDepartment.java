//package week2.coding.assignment;

//======= The Child Class(or Derived Class) =======//
class AdminDepartment extends SuperDepartment {
	
	//======= Member Function to return Department Name =======//
	String departmentName() {
		//_______ Variable storing Department Name _______//
		String msg = "Admin Department ";
		//_______ Return message _______//
		return msg;
	}
	
	//======= Member Function to return Work =======//
	String getTodaysWork() {
		//_______ Variable storing Work _______//
		String msg = "Complete your documents Submission";
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
	
}
