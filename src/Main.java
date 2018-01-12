/**
 * Created by java on 12.01.2018.
 */
public class Main {
    public static void main(String[] args) {
        Student st = new Student("Vasia",true,false,17,"Kirova",75,180);

        Student [] studArray = new Student[20];

        for (int i = 0; i < 20; i++)
        {
            Student stud = new Student("name" + i,true,false,17,"Kirova " + i,75,180);
            studArray[i] = stud;
        }
        for (Student student : studArray) {
            System.out.println(student.getStudent());
        }
    }
}
