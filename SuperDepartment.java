//package week2.coding.assignment;

//======= The Parent Class(or Super Class) =======//
class SuperDepartment {
	
	//======= Member Function to return Department Name =======//
	String departmentName() {
		//_______ Variable storing Department Name _______//
		String msg = "Super Department";
		//_______ Return message _______//
		return msg;
	}
	
	//======= Member Function to return Work =======//
	String getTodaysWork() {
		//_______ Variable storing Work _______//
		String msg = "No work as of now";
		//_______ Return message _______//
		return msg;
	}
	
	//======= Member Function to return Work Deadline =======//
	String getWorkDeadline() {
		//_______ Variable storing Work Deadline _______//
		String msg = "nil";
		//_______ Return message _______//
		return msg;
	}
	
	//======= Member Function to return Holiday =======//
	String isTodayAHoliday() {
		//_______ Variable storing Holiday _______//
		String msg = "Today is not a holiday";
		//_______ Return message _______//
		return msg;
	}
}
