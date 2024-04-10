class Student{
    String id;
    String name;
    String marks;
}

public class Demo {
    public static void main(String args[]){
        // int[][] arr = new int[3][4];
        // for(int i=0;i<3;i++)
        // {
        //     for(int j=0;j<4;j++)
        //     {
        //         arr[i][j] = (int)(Math.random()*10);
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // //Enhanced loop for printing 2D array
        // for(int n[]:arr){
        //     for(int m:n){
        //         System.out.print(m +" ");
        //     }
        //     System.out.println();
        // }
        Student s1 = new Student();
        s1.id = "1";
        s1.name = "Mani";
        s1.marks = "91";

        Student s2 = new Student();
        s2.id = "2";
        s2.name = "Sunil";
        s2.marks = "82";

        Student s3 = new Student();
        s3.id = "3";
        s3.name = "Niraj";
        s3.marks = "99";
        
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        
        for(Student stud: students){
            System.out.println(stud.name + " : " +stud.marks);
        }
    }
}