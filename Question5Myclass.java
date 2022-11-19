//Kareena
//19105112
/*Question 5. What is the output of the following snippet code?

public class Myclass
{
final static int x;

static {
x = 10;
}
public static void main(String[]
args) {
System.out.println(x);
}
} */

//Solution
//Output is 10
/*
 * Code inside a static block runs once when the class is being loaded to the memory.
 */
public class MyclassQ5
{
final static int x;

static {
x = 10;
}
public static void main(String[]
args) {
System.out.println(x);
}
}

