package IntroUser;

public class IntroUserManager {
    public String UserControl(IntroUser introUser){
        if (introUser.userName=="Hako" && introUser.password=="2"){
            return "Giris Basarili";
        }
        else
            return "Giris Basarisiz";
    }

    public void userDonus(IntroUser introUser){

       System.out.println(introUser.userId +" "+ "ile giris yapildi");

    }

}
