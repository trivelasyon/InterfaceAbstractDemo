package GamerWork;

import GamerWork.Entities.IUser;

import java.text.DateFormat;

public class Player implements IUser {
   private int id;
   private String name;
   private String surName;
   private String identityNumber;
   private int dateBirth;

   public Player(){

   }

    public Player(int id, String name, String surName, String identityNumber, int dateBirth) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.identityNumber = identityNumber;
        this.dateBirth = dateBirth;
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

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public int getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(int dateBirth) {
        this.dateBirth = dateBirth;
    }
}
