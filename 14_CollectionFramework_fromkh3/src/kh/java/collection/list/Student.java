package kh.java.collection.list;

import java.util.Objects;

public class Student implements Comparable<Student>{

	private int no;
	private String name;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + "]";
	}

	/**
	 * 기본 정렬 기준
	 * no 오름차순
	 */
	@Override
	public int compareTo(Student o) {
		return this.no - o.no;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(no, name);
	}
	
	/**
	 * no, name필드값이 동일하면 같은 객체라고 간주.
	 */
	@Override
	public boolean equals(Object o) {
		if(this == o)
			return true;
		
		if(o == null)
			return false;
		
		if(!(o instanceof Student))
			return false;
		
		Student other = (Student)o;
		if(no != other.no)
			return false;
		
		if(name == null) {
			if(other.name != null) {
				return false;
			}
		}
		else {
			if(!name.equals(other.name))
				return false;
		}
		
		return true;
	}
	
	
}
