package GamerWork.Concrete;

import GamerWork.Abstract.IPlayerService;
import GamerWork.Game;
import GamerWork.Player;

public class PlayerManager implements IPlayerService {

    private Game game;

    public PlayerManager(Game game){
        this.game=game;
    }
    @Override
    public void createUser(Player player){
        System.out.println("Player tarafindan kullanici girisi yapildi");
    }
    @Override
    public void buyGame(Player player){
        System.out.println(player.getName()+player.getSurName()+""+game.getName()+"oyununu satin aldiniz oyun fiyatı :"+game.getPrice());
    }
    @Override
    public void updateInfo(Player player){
        System.out.println(player.getName()+player.getSurName()+"kullanicisi güncellendi");
    }
    @Override
    public void deleteInfo(Player player){
        System.out.println("PLayer Id'si :"+player.getId()+" olan kullanicisi silindi");
    }
}
