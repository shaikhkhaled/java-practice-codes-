package pjava;

public class studentQ2 {
    private String name="khaled";
    double marks = 10.5;


public String getName(){
    return name;

}


        static void main(String[] args) {
            studentQ2 sc=new studentQ2();
            System.out.println(sc.name);
            System.out.println(sc.marks);

            sc.name="Arbaz";
            System.out.println(sc.name);
            sc.marks=20.5;
            System.out.println(sc.marks);


        }
    }

