import java.util.*;
import java.sql.*;


public class DBcon 
{

	public void insert() 
	{
		try{
			Scanner sc =new Scanner(System.in);
			Con1 cc = new Con1();
			
			System.out.println("studetn id");
			int sid =sc.nextInt();
			System.out.println("student name");
			String sname=sc.next();
			System.out.println("enter m1 marls ");
			int m1=sc.nextInt();
			System.out.println("enter m3 marls ");
			int m2=sc.nextInt();
			System.out.println("enter m3 marls ");
			int m3=sc.nextInt();
			
		//	
			
			String sql ="insert into Student values(?,?,?,?,?)";
			PreparedStatement pst = cc.con.prepareStatement(sql);
			pst.setInt(1,sid);
			pst.setString(2,sname);
			pst.setInt(3,m1);
			pst.setInt(4,m2);
			pst.setInt(5,m3);
			
			pst.execute();
		
		}catch(Exception e){}
	}


	public void display() 
	{
		try{
				Con1 cc = new Con1();
				System.out.println("sid \t sname \t m1\tm2\tm3");
				String sql="select * from Student";
				PreparedStatement pst = cc.con.prepareStatement(sql);
				
				ResultSet rs;
				rs =pst.executeQuery();
				while(rs.next())
				{
					System.out.print(rs.getInt(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getInt(3)+"\t");
					System.out.print(rs.getInt(4)+"\t");
					System.out.print(rs.getInt(5)+"\t");
					System.out.println();
				}
				
				
		}catch(Exception e){}
	}

	public void delete() {
		
	}


	public void result() 
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			Con1 cc = new Con1();
			System.out.println("sum of student marks");
			System.out.println("enter the student id");
			int sid=sc.nextInt();
			
		//	System.out.println("sid \t sname \tm1\tm2\tm3");
			String sql = "select (m1+m2+m3)  from student where sid = "+sid+"";
			
			PreparedStatement pst = cc.con.prepareStatement(sql);
			ResultSet rs;
			rs =pst.executeQuery();
		
			while(rs.next())
			{
				System.out.print("total marks ="+rs.getInt(1)+"\t");
				System.out.println();
			}
			
		}catch(Exception e){}
		
	}


	public void result1() {
		try
		{
			Scanner sc = new Scanner(System.in);
			Con1 cc = new Con1();
			System.out.println("sum of student marks");
			System.out.println("enter the student id");
			int sid=sc.nextInt();
			
		//	System.out.println("sid \t sname \tm1\tm2\tm3");
			String sql = "select (((m1+m2+m3)/300)*100)  from student where sid = "+sid+"";
			
			PreparedStatement pst = cc.con.prepareStatement(sql);
			ResultSet rs;
			rs =pst.executeQuery();
//			int sum = 0;
			while(rs.next())
			{
				System.out.print("Percentage ="+rs.getInt(1)+"\t");
			System.out.println();
			}
			
		}catch(Exception e){}
		
		
	}

	
}
















