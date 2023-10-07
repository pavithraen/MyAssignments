package Assignments;


public class OverLoad {

	public void getStudentInfo(int id)
	{
		System.out.println(id);
	}
	public void getStudentInfo(int id, String name)
	{
		System.out.println(id + "" + name);
	}
	public void getStudentInfo(long p_number, String email)
	{
		System.out.println(p_number+ "" + email);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoad ovl=new OverLoad();
		ovl.getStudentInfo(15);
		ovl.getStudentInfo(15,"bob");
		ovl.getStudentInfo(978965653,"abc@gmail.com");

	}

}
