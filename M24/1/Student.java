class Student{
	private String name;
	// String rollNumber;
	private Double  marks;
	public String getName(){
		return name;
	}
	public Double getMarks(){
		return marks;
	}
	Student(String studName, Double total){
		this.name = studName;
		// this.rollNumber = rollNum;
		this.marks = total;
	}

}