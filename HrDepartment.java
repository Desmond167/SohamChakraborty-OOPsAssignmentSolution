//package week2.coding.assignment;

//======= The Child Class(or Derived Class) =======//
class HrDepartment extends SuperDepartment{
	
	//======= Member Function to return Department Name =======//
	String departmentName() {
		//_______ Variable storing Department Name _______//
		String msg = "Hr Department";
		//_______ Return message _______//
		return msg;
	}
	
	//======= Member Function to return Work =======//
	String getTodaysWork() {
		//_______ Variable storing Work _______//
		String msg = "Fill today’s worksheet and mark your attendance";
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
	
	//======= Member Function to return Activity =======//
	String doActivity() {
		//_______ Variable storing Activity _______//
		String msg = "team Lunch";
		//_______ Return message _______//
		return msg;
	}
}
