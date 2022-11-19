//Kareena
//19105112

/*Question 3. We want to calculate the total marks of each student of a class in Physics,
Chemistry and Mathematics and the average marks of the class. The number of students in
the class are entered by the user. Create a class named Marks with data members for roll
number, name and marks. Create three other classes inheriting the Marks class, namely

Physics, Chemistry and Mathematics, which are used to define marks in individual subject of
each student. Roll number of each student will be generated automatically. */

import java.util.Scanner;
class Marks{
    static int rollNo = 0;
    String name;
    static float totalMarks;
    static float classTotal;
    Marks(String name){
       this.name = name;
       Marks.rollNo +=1;
    }
    static void totalMarks(){
        classTotal += totalMarks;
        System.out.println("Total Marks scored  : " + totalMarks);
        totalMarks = 0;
    }
    static float averageTotalMarks(){
        return classTotal;
    }

}
class Physics extends Marks{
    float marks;
    Physics(String name,float marks){
        super(name);
        this.marks = marks;
        totalMarks += marks;
    }
    void displayMarks(){
        System.out.println("Physics Score: " + marks);
    }
}
class Chemistry extends Marks{
    float marks;
    Chemistry(String name, float marks){
        super(name);
        this.marks = marks;
        super.totalMarks += marks;
    }
    void displayMarks(){
        System.out.println("Chemistry Score : " + marks);
    }

}

class Mathematics extends Marks{
    float marks;
    Mathematics(String name,float marks){
        super(name);
        this.marks = marks;
        super.totalMarks += marks;
    }
    void displayMarks(){
        System.out.println("Mathematics Score: " + marks);
    }
}



public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = n;
        while(count>0){
            System.out.println("Enter the name of the student");
            String name = sc.next();
            System.out.println("Enter the marks of a new student with roll no : " + n);
            System.out.println("Marks scored in Physics : ?");
            float physicsMarks = sc.nextFloat();
            System.out.println("Marks scored in Mathematics : ?");
            float mathematicsMarks = sc.nextFloat();
            System.out.println("Marks scored in Chemistry : ?");
            float chemistryMarks = sc.nextFloat();
            Physics p= new Physics(name,physicsMarks);
            Mathematics m= new Mathematics(name,mathematicsMarks);
            Chemistry c = new Chemistry(name,chemistryMarks);
            Marks.totalMarks();
            count--;
        }
        sc.close();
        float marks = Marks.averageTotalMarks();
        System.out.println("Average marks of the Class = "+ (marks/n));
    }
}

