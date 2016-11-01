package se.joshua.party.service;

import org.openspaces.remoting.ExecutorRemotingMethod;
import org.openspaces.remoting.Routing;
import se.joshua.party.domain.CreatePlayerRequest;
import se.joshua.party.domain.Player;

import java.util.Set;

/**
 * @author Ali Yusha {@literal <mailto:Ali.yusha@so4it.com/>}
 */
public interface PlayerService {

    @ExecutorRemotingMethod(broadcast = false)
    Player getPlayer(@Routing String userName);

    @ExecutorRemotingMethod(broadcast = false)
    void createPlayer(@Routing("getUserName") CreatePlayerRequest createPlayerRequest);

    @ExecutorRemotingMethod(broadcast = true)
    Set<Player> getPlayers();

}
