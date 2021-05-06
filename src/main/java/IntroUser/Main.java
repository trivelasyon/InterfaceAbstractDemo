package IntroUser;

public class Main {
    public static void main (String [] args) {
        String donus;
        IntroUser user=new IntroUser(1,"Hako","2");
        IntroUserManager usem=new IntroUserManager();
        donus=usem.UserControl(user);
        System.out.println();
        usem.userDonus(user);
    }
}
