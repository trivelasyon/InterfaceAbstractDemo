package GamerWork.Abstract;

import GamerWork.Game;
import GamerWork.Player;

public interface IPlayerService {

    void buyGame(Player player);

    void createUser(Player player);

    void updateInfo(Player player);

    void deleteInfo(Player player);
}
