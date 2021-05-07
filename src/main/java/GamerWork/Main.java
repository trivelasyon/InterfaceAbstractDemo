package GamerWork;

import GamerWork.Class.Campaign;
import GamerWork.Concrete.PlayerManager;
import GamerWork.Concrete.SellerManager;
import GamerWork.Seller;
import GamerWork.Player;
import GamerWork.Game;

public class Main {
    public static void main(String[] args) {

      Player player=new Player(1,"Hakan","Özel","32123123",1992);
      Seller seller=new Seller(4,"Selami","Huzur","Seller");
      Game game=new Game(1,"Age Of Empires",50,"Strategy");
      Campaign campaign=new Campaign(1,"Yil sonu indirimi",50);

      PlayerManager playermanager = new PlayerManager(game);
      playermanager.buyGame(player);
      playermanager.createUser(player);
      playermanager.updateInfo(player);
      playermanager.deleteInfo(player);

      SellerManager sellerManager = new SellerManager(game,campaign);
      sellerManager.addCampaign(seller);

    }
}
