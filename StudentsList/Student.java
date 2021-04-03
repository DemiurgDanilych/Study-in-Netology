package StudentsList;

import java.util.Objects;

public class Student {
	private String name;
	private String group;
	private String studentID;
	
	public Student(String name, String group, String studentID) {
		this.name = name;
		this.group = group;
		this.studentID = studentID;
	}
	
	@Override
	public String toString() {
		return " - " + name + ", " + group + ", " + studentID;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Student student = (Student) o;
		return Objects.equals(studentID,student.studentID);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(studentID);
	}
}