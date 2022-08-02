package morningbatch11am;

public class abcd {


public int sub(int a, int b)
{
	int c;
	c=a-b;
	System.out.println("sub result is"+c);
	return c;
}

public int sum (int c, int d)
{
int e;
e=c+d;
System.out.println("sum result is "+e);
return e;
}

public static void main(String[] args) {
abcd gsk =new abcd();
int sumresult =gsk.sum(10, 2);
int subresult =gsk.sub(10, 2);
}
}