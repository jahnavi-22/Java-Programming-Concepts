package classes;

public class StaticNestedClasses {
	
	static private String companyName;
	
	//nested class
	static public class CandidateInfo{
		private String name;
		private int age;
		private int id;
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
		public String getCompanyName(){
			return companyName;
		}
		public void setCompanyName(String _companyName) {
			companyName = _companyName;		//can't use this here because companyName is not an instance variable of the nested class
		}
		
		//double nested class
		public class CandidateSalary{
			private int salary;

			public int getSalary() {
				return salary;
			}

			public void setSalary(int salary) {
				this.salary = salary;
			}
		}
	}
	
	
	public static void main(String[] args) {
		StaticNestedClasses obj = new StaticNestedClasses();
		CandidateInfo obj_ci = new CandidateInfo();		//not obj.new CandidateInfo() because it can be instantiated without the instance of the enclosing non-static class
		CandidateInfo.CandidateSalary obj_ci_salary = obj_ci.new CandidateSalary();		//both are static
		
		obj_ci.setName("Tim");
		obj_ci.setAge(25);
		obj_ci.setId(86);
		obj_ci.setCompanyName("Google");
		obj_ci_salary.setSalary(2900000);

		System.out.println("Name : " + obj_ci.getName());
		System.out.println("Age : " + obj_ci.getAge());
		System.out.println("ID : " + obj_ci.getId());
		System.out.println("Company Name : " + obj_ci.getCompanyName());
		System.out.println("Salary : " + obj_ci_salary.getSalary());
	}
}
