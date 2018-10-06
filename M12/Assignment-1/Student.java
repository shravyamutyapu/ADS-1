class Student implements Comparable<Student>{
	String studentName;
	String dateOfBirth;
	int subject1;
	int subject2;
	int subject3;
	int total;
	String category;
	Student(String arr){
		String[] studDetails = arr.split(",");
		this.studentName = studDetails[0];
		this.dateOfBirth = studDetails[1];
        //int[] details = studDetails[1].split("-");
        // int day = details[0];
        // int month = details[1];
        // int year = details[2];
		this.subject1 = Integer.parseInt(studDetails[2]);
		this.subject2 = Integer.parseInt(studDetails[3]);
		this.subject3 = Integer.parseInt(studDetails[4]);
		this.total = Integer.parseInt(studDetails[5]);
		this.category = studDetails[6];

	}
	public int compareTo(Student that) {
        if (this.total > that.total) {
            return 1;
        } else if (this.total < that.total) {
            return -1;
        } else if (this.subject3 > that.subject3) {
            return 1;
        } else if (this.subject3 < that.subject3) {
            return -1;
        } else if (this.subject2 > that.subject2) {
            return 1;
        } else if (this.subject2 < that.subject2) {
            return -1;
		}else if (this.dateOfBirth.compareTo(that.dateOfBirth)<0) {
            return 1;
        }else if (this.dateOfBirth.compareTo(that.dateOfBirth)>0) {
            return -1;
        } else
            return 0;
        }
    public String toString() {
    	return studentName + "," + total + "," + category;
    }

}