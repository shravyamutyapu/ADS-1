/**
 * student class that
 * contains student details.
 */
class Student {
	/**
	 * name of the student.
	 */
	private String name;
	// String rollNumber;
	/**
	 *marks obtained by student.
	 */
	private Double  marks;
	/**
	 * returns student name.
	 * @return studentName[description]
	 */
	public String getName() {
		return name;
	}
	/**
	 * returns total marks.
	 * @return students marks.
	 */
	public Double getMarks() {
		return marks;
	}
	/**
	 * parameterized constructor.
	 * @param studName [description]
	 * @param total [description]
	 */
	Student(String studName, Double total) {
		this.name = studName;
		// this.rollNumber = rollNum;
		this.marks = total;
	}

}
