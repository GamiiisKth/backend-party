package se.joshua.party.client;

import se.joshua.party.runner.domain.CreatePlayerRequest;
import se.joshua.party.runner.domain.Player;

import java.util.Set;

/**
 * @author Ali Yusha {@literal <mailto:Ali.yusha@so4it.com/>}
 */
public interface PlayerClient {

    Player getPlayerByUserName(String userName);

    void createPlayer(CreatePlayerRequest createPlayerRequest);

    Set<Player> getPlayer();

}
