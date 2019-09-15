class StudentMgt{
	Student mystd=null;

	StudentMgt(Student s){
		this.mystd=s;
	}

	public void display(){
		System.out.println(mystd.toString());
	}

	public int calTotal(){
		return mystd.getEnglish() + mystd.getPhysics() + mystd.getChemistry() + mystd.getBiology() + mystd.getMaths();
	}

	public float calAvg(){
		return ((float)((mystd.getEnglish() + mystd.getPhysics() + mystd.getChemistry() + mystd.getBiology() + mystd.getMaths())/(5.0)));
	}
}