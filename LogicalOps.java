 class LogicalOps
{
	public static void main(String[] args)
	{
	 String x = "Sher";
	 String y = "Locked";
	 
	 scanner s = new scanner(System.in);
	 System.out.print("Enter username:");
	 String uuid = s.next();
	 System.out.print("Enter password:");
	 String upwd = s.next();
	 if((uuid.equals(x) && upwd.equals(y)) ||(uuid.equals(y)&& upwd.equals(x)))
	 {
	  System.out.println("Welcome user."); 
	 }
	 else
	 {
       System.out.println("Wrong uid or password");
	 }
	}
}