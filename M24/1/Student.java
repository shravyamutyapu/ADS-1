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
     * time complexity is O(1).
     * @return studentName[description]
     */
    public String getName() {
        return name;
    }
    /**
     * returns total marks.
     * time complexity is O(1).
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
    Student(final String studName, final Double total) {
        this.name = studName;
        // this.rollNumber = rollNum;
        this.marks = total;
    }

}
