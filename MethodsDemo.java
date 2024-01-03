package sukmawan;

public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo TellYourName = new MethodsDemo();
		TellYourName.getData();
		TellYourName.getDataName();
		
		String MyName = TellYourName.getDataByName();
		System.out.println(MyName);
		
		String MyWifeName = getMyWife();
		//System.out.println(MyWifeName);
		getMyWife();
		
		
		MethodsDemo2 TellMySon = new MethodsDemo2();
		TellMySon.getMySon();
		
		MethodsDemo2 TellMyDaughter = new MethodsDemo2();
		TellMyDaughter.getMyDaughter();
		
		
		
		
		
		
		
		
		
	}
	public void getData()
	{
		System.out.println("My name is sukmawan 1");
	}
	
	public void getDataName()
	{
		System.out.println("Muhammad");
	}
	public String getDataByName()
	{
		return "Sukmawan 2";
	}
	

	public static String getMyWife()
	{
		System.out.println("Dian Elysa Putri");
		return "Sukmawan 3";
	}
	
	}
