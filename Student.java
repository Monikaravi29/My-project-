class Student{
    String Name="";
    int Age=0;
    String Department="";
    public static void main(String args[]){
        Student stud1=new Student();
        stud1.Name="Monika";
        stud1.Age=21;
        stud1.Department="CSE";
        Student stud2=new Student();
        stud2.Name="Tamil";
        stud2.Age=20;
        stud2.Department="MECH";
        {
            System.out.println(stud1.Age+stud1.Name+stud1.Department);
        }
    }
}