import java.util.Arrays;


public class Student
{
	int sid;
	int sname;
	int m1;
	int m2;
	int m3;
	
	public Student(int sid, int sname, int m1, int m2, int m3) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", m1=" + m1
				+ ", m2=" + m2 + ", m3=" + m3 + "]";
	}
	
	
	
	
	
}
