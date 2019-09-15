class Main{
	public static void main(String[] args) {
		Student student=new Student();
		//First name
		student.setFname("Mahavir");
		//Middle name
		student.setMname("Nareshbhai");
		//Last name
		student.setLname("Patel");
		//Id
		student.setId("170010116034");
		//Mobile no
		student.setMobileno("7000000020");
		//Email
		student.setEmail("170010116034@adit.ac.in");
		//Branch
		student.setBranch("IT");
		student.setMaths(98);
		student.setPhysics(96);
		student.setEnglish(98);
		student.setBiology(97);
		student.setChemistry(95);
		StudentMgt mgt=new StudentMgt(student);
		mgt.display();
		System.out.println("Total Marks : " + mgt.calTotal());
		System.out.println("Avarage Marks : " + mgt.calAvg());
		}
}
