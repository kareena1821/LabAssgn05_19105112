//Kareena
//19105112
/*Question 4. Will the following code snippet compile fine? If yes, what will be the output of
the following program?

public class Myclass {
static int a = 20;
Myclass() {
a++;
}
Void m1() {
a++;
System.out.println(a):
}
public static void main(String[]
args)
{
Myclass obj = new Myclass();
Myclass obj2 = new Myclass();
Myclass obj3 = new Myclass();
obj3.m1();
}
}
 */


//Solution
//Output is 24.
/*Two errors:
 * First is colon was typed instead of semi colon and 'V' of Void was capital.
 */
public class Question4Myclass {
    static int a = 20;
    Question4Myclass() {
    a++;
    }
    void m1() {
    a++;
    System.out.println(a);
    }
    public static void main(String[]
    args)
    {
    Question4Myclass obj = new Question4Myclass();
    Question4Myclass obj2 = new Question4Myclass();
    Question4Myclass obj3 = new Question4Myclass();
    obj3.m1();
    }
    }
