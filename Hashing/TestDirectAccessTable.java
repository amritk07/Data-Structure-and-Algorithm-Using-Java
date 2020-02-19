package hashingProblem;
class DirectAccess
{
	int size;
	String[] arr;
	DirectAccess(int size)
	{
		this.size = size;
		arr = new String[size];
	}
	public void insert(int k, String d)
	{
		arr[k] = d;
	}
	public void delete(int k)
	{
		arr[k] = null;
	}
	public String search(int k)
	{
		String str = arr[k];
		return str;
	}
	public void printTable()
    {
        System.out.println("\nDirect Addressing Table : ");
        int l = arr.length;
        for (int i = 0; i < l; i++)
            if (arr[i] != null)
                System.out.println(i +" "+ arr[i]);
        System.out.println();        
    }
	
}




public class TestDirectAccessTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        DirectAccess direct = new DirectAccess(1000);
        direct.insert(0, "Hello");
        direct.insert(2 ,"Amrit");
        direct.insert(3 ,"kumar");
        direct.delete(3);
        direct.printTable();
	}

}
