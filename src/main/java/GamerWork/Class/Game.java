package GamerWork;

import GamerWork.Entities.IProduct;

public class Game implements IProduct {
   private int id;
   private String name;
   private int price;
   private String gameType;

   public Game(){}

    public Game(int id, String name, int price, String gameType) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.gameType = gameType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }
}
