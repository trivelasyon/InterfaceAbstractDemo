package GamerWork.Concrete;

import GamerWork.Abstract.ISellerService;
import GamerWork.Class.Campaign;
import GamerWork.Game;
import GamerWork.Seller;


public class SellerManager implements ISellerService {

    private Game game;
    private Campaign campaign;


    public  SellerManager(Game game,Campaign campaign){
        this.game=game;
        this.campaign=campaign;
    }

    @Override
    public void addCampaign(Seller seller){
        System.out.println(this.game.getName()+" Adli oyun icin " +campaign.getName()+" kampanyasi "+ seller.getName()+""+seller.getSurName()+" tarafindan  eklendi");
    }
    @Override
    public void deleteCampaign(Seller seller ){
        System.out.println(campaign.getName()+"kampanyasi"+seller.getName()+""+seller.getSurName()+"tarafindan silindi");
    }
    @Override
    public void updateCampaign(Seller seller ){
        System.out.println(campaign.getName()+"kampanyası "+seller.getName()+""+seller.getSurName()+"tarafindan"+campaign.getPercent()+"oraninda güncellendi");
    }

}
