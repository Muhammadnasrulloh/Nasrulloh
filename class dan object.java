public class lol {
/* Instance Variabel */
String name;
String breed;
int age;
String color;

/* Deklarasi konstructor dari class */
public lol(String name, String breed, int age, String color)
{
this.name = name;
this.breed = breed;
this.age = age;
this.color = color;
}

/* method 1 */
public String getName()
{
return name;
}

/* method 2 */
public String getBreed()
{
return breed;
}

/* method 3 */
public int getAge()
{
return age;
}

/* method 4 */
public String getColor()
{
return color;
}
public String toString()
{
return ("Hi my name is " + this.getName() +
 ".\n My breed, age and color are " + this.getBreed()
 + ", " + this.getAge() + ", " + this.getColor());
}

public static void main(String[] args)
{
lol sul = new lol("sulton", "papillon", 5, "white");
 System.out.println(sul.toString());
}
}
