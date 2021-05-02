package Homework2;

import Inheritance.Customer;

public class InsturctorManager extends UserManager {
    @Override
    public void add(User user){
        System.out.println(user.name+user.sureName+"adli"+" "+"Instructor eklendi");
    }
    @Override
    public void sendMail(User user){
        System.out.println(user.id+""+".kullanıcıya mail gönderildi");
    }

    public void getInfoInstructor(Instructor instructor){
        System.out.println("Talent :" +instructor.getTalents()+" "+"Insitution:"+instructor.getInstitution());
    }
}
