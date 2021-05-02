package Homework2;

public class Main {
    public static void main (String [] args) {
     UserManager userManager=new UserManager();

     Student student=new Student();
     student.id=1;
     student.name="Omar";
     student.sureName="Jackson";
     student.statu="Prime";
     student.setDepartment("Computer engineering");
     student.setSchool("Istanbul University");

     Instructor instructor=new Instructor();
     instructor.id=2;
     instructor.name="Sasi";
     instructor.sureName="Caz";
     instructor.statu="Low";
     instructor.setInstitution("Software Course");
     instructor.setTalents("C# - JAVA - SPRING");
     StundentManager studentManager=new StundentManager();
     User[] users=new User[]{student,instructor};

     userManager.add(student);
     studentManager.add(student);
     studentManager.sendMail(student);
     studentManager.getStundentDepartment(student);

     userManager.add(instructor);
     InsturctorManager insturctorManager=new InsturctorManager();
     insturctorManager.add(instructor);
     insturctorManager.sendMail(instructor);
     insturctorManager.getInfoInstructor(instructor);


    }
}
