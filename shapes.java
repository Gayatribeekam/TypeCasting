class shapes
{
public double area(shapes s)
{
double pi=3.14;
circle c=(circle)s;
double res =pi*(c.radius *c.radius);
return res;
}
}
class circle extends shapes
{
int radius;
circle(int radius)
{
this.radius =radius;
}
}
class square extends shapes
{
int sides;
square(int sides)
{
this.sides=sides;
}
}
class driver2
{
public static void main(String[]args)
{
shapes c = new shapes();
System.out.println(c.area(new circle/(2)));
}
}