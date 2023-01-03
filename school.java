package scl_management_2;

   import java.util.ArrayList;
   import java.util.List;
    public class Main {
        public static void main(String[] args) {
            Teacher malar = new Teacher(1,"malar",500);
            Teacher mathi = new Teacher(2,"Mathi",700);
            Teacher varun = new Teacher(3,"Varun",600);

            List<Teacher> teacherList = new ArrayList<>();
            teacherList.add(malar);
            teacherList.add(mathi);
            teacherList.add(varun);

            Student vikram = new Student(1,"vikram",4);
            Student vedha = new Student(2,"Rakshith Vasudev",12);
            Student rabbi = new Student(3,"Rabbi",5);
            List<Student> studentList = new ArrayList<>();
            studentList.add(vikram);
            studentList.add(rabbi);
            studentList.add(vedha);

            School ghs = new School(teacherList,studentList);

            Teacher megan = new Teacher(6,"Megan", 900);

            ghs.addTeacher(megan);

            vikram.payFees(5000);
            vedha.payFees(6000);
            System.out.println("GHS has earned $"+ ghs.getTotalMoneyEarned());

            System.out.println("------Making SCHOOL PAY SALARY----");
            malar.receiveSalary(malar.getSalary());
            System.out.println("GHS has spent for salary to " + malar.getName()
                    +" and now has $" + ghs.getTotalMoneyEarned());

            varun.receiveSalary(varun.getSalary());
            System.out.println("GHS has spent for salary to " + varun.getName()
                    +" and now has $" + ghs.getTotalMoneyEarned());

            System.out.println(vedha);
            mathi.receiveSalary(mathi.getSalary());
            System.out.println(mathi);
        }
}
