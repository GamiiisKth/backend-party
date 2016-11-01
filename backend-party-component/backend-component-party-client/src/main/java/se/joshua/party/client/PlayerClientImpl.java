package se.joshua.party.client;

import se.joshua.party.runner.domain.CreatePlayerRequest;
import se.joshua.party.runner.domain.Player;
import se.joshua.party.service.PlayerService;

import java.util.Set;

/**
 * @author Ali Yusha {@literal <mailto:Ali.yusha@so4it.com/>}
 */
public class PlayerClientImpl implements PlayerClient {

    private PlayerService playerService;

    public PlayerClientImpl(PlayerService playerService) {
        this.playerService = playerService;
    }

    // add Optional
    @Override
    public Player getPlayerByUserName(String userName) {
        return  playerService.getPlayerByUserName(userName);
    }

    @Override
    public void createPlayer(CreatePlayerRequest createPlayerRequest) {
        playerService.createPlayer(createPlayerRequest);
    }

    @Override
    public Set<Player> getPlayer() {
        return playerService.getPlayers();
    }
}
