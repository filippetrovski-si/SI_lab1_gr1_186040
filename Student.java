class Student {
	String index;
	String firstName;
	String lastName;
	List<Integer> labPoints=new ArrayList<Integer>();
	//TODO constructor

	public Student(String index, String firstName, String lastName, List<Integer> labPoints) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.labPoints = labPoints;
	}

	//TODO seters & getters

	public void setIndex(String index) {
		this.index = index;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setLabPoints(List<Integer> labPoints) {
		this.labPoints = labPoints;
	}

	public String getIndex() {
		return index;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public List<Integer> getLabPoints() {
		return labPoints;
	}

	public double getAverage() {
		//TODO
		double average;
		for (int i=0;i<labPoints.length();i++){
			average=average+labPoints[i];
		}
		return average/labPoints.length();
	}

	public boolean hasSignature() {
		//TODO
		if(labPoints.length()>8)
			return true
		else
			return false;
	}
}
