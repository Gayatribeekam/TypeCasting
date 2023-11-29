class narrowtypecast
{
public static void main(String[]args)
{
double d = 784687.764;
long l = (long)d;
int i = (int)l;
System.out.print("Before conversion:"+d);
System.out.print("After conversion into long type:"+l);
System.out.print("After conversion into int type:"+i);
}
}