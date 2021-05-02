package Homework2;

public class StundentManager extends UserManager{
    @Override
    public void add(User user){
        System.out.println("adi:"+user.name+" "+"soyadi."+user.sureName+" "+"olan öğrenci eklendi");
    }
    @Override
    public void sendMail(User user) {
        System.out.println("ID:"+ user.id+" "+"olan Eğiticiye mail gönderildi");
    }
    public void getStundentDepartment(Student student){
        System.out.println("Orencinin okulu"+student.getSchool()+" "+"Ogrenci bolumu :"+student.getDepartment());
    }
}
