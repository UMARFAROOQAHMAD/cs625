class LengthDemo {
	public static void main(String args[]) {
	int list[] = new int[10];
	int nums[] = {1,2,3};
	int table[] [] = {
	{1,2,3},
	{4,5},
	{6,7,8,9}
	};
	System.out.println("length of the list" + list.length);
	System.out.println("length of the nums is" + nums.length);
	System.out.println("length of the table is" + table.length);
	System.out.println("length of the table[0] is" + table[0].length);
	System.out.println("length of the table[1] is" + table[1].length);
	System.out.println("length of the table[2] is" + table[2].length);
	System.out.println();
	for(int i = 0; i < list.length; i++)
	list[i] = i*i;
	System.out.print("Here is list:");
	for(int i = 0; i < list.length; i++)
	System.out.println(list[i] + " ");
	System.out.println();
		} 
}