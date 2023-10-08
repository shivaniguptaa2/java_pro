class student{
    int roll_no;
    String name;
    int marks;
}
class demo{
    public static void main(String args[])
    {
        student s1 = new student();
        s1.roll_no = 1;
        s1.name = "Raghav";
        s1.marks = 89;

        student s2 = new student();
        s2.roll_no = 2;
        s2.name = "Raga";
        s2.marks = 79;

        student s3 = new student();
        s3.roll_no = 1;
        s3.name = "Rama";
        s3.marks = 89;

        student students[] = new student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // for(int i = 0; i <students.length;i++){
        //     System.out.println("My name is " +students[i].name+ " and my roll number is " +students[i].roll_no+ " and I scored " +students[i].marks+ " marks.");
        // }

        // using enhanced for loop
        for(student stud: students){
            System.out.println("My name is " +stud.name+ " and my roll number is " +stud.roll_no+ " and I scored " +stud.marks+ " marks.");
        }

    }
}