class Student{
	String id;
	String fname;
	String mname;
	String lname;
	String mobileno;
	String email;
	String branch;
	int physics;
	int maths;
	int biology;
	int chemistry;
	int english;

	//POJO(Playing Old Java Object)
	//ID
	String getId(){
		return id;
	}
	void setId(String id){
		this.id=id;
	}

	//First Name
	String getFname(){
		return fname;
	}
	void setFname(String fname){
		this.fname=fname;
	}

	//Middle Name
	String getMname(){
		return mname;
	}
	void setMname(String mname){
		this.mname=mname;
	}

	//Last Name
	String getLname(){
		return lname;
	}
	void setLname(String lname){
		this.lname=lname;
	}

	//Mobile No
	String getMobileno(){
		return mobileno;
	}
	void setMobileno(String mobileno){
		this.mobileno=mobileno;
	}

	//Email
	String getEmail(){
		return email;
	}
	void setEmail(String email){
		this.email=email;
	}

	//Branch
	String getBranch(){
		return branch;
	}
	void setBranch(String branch){
		this.branch=branch;
	}

	int getMaths(){
		return maths;
	}
	void setMaths(int maths){
		this.maths=maths;
	}

	int getPhysics(){
		return physics;
	}
	void setPhysics(int physics){
		this.physics=physics;
	}

	int getBiology(){
		return biology;
	}
	void setBiology(int biology){
		this.biology=biology;
	}

	int getEnglish(){
		return english;
	}
	void setEnglish(int english){
		this.english=english;
	}

	int getChemistry(){
		return chemistry;
	}
	void setChemistry(int chemistry){
		this.chemistry=chemistry;
	}

	public String toString(){
		return id + " " + fname + " " + mname + " " + lname + " " + mobileno + " " + email + " M:" + maths + " P:" + physics + " C:" + chemistry  + " B:" + biology + " E:" + english;
	}

}


