package se.joshua.party.runner.service;

import org.openspaces.remoting.ExecutorRemotingMethod;
import org.openspaces.remoting.Routing;
import se.joshua.party.runner.domain.CreatePlayerRequest;
import se.joshua.party.runner.domain.Player;

import java.util.Set;

/**
 * @author Ali Yusha {@literal <mailto:Ali.yusha@so4it.com/>}
 */
public interface PlayerService {

    @ExecutorRemotingMethod(broadcast = false)
    Player getPlayerByUserName(@Routing String userName);

    @ExecutorRemotingMethod(broadcast = false)
    void createPlayer(@Routing("getUserName") CreatePlayerRequest createPlayerRequest);

    @ExecutorRemotingMethod(broadcast = true)
    Set<Player> getPlayers();

}
