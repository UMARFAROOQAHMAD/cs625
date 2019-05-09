class NestVarFixed
{
	public static void main(String args[])
	{
	 int count;
	 for(count = 0; count < 10; count = count+1) 
	 {
	   System.out.println("This is count:" + count);
	   for(int i = 0; i < 2; i++)
	   System.out.println("This program is in error!");
	 } 
	}
}