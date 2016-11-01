package se.joshua.party.runner.service;

import se.joshua.party.runner.dao.PlayerEntityDao;
import se.joshua.party.runner.domain.CreatePlayerRequest;
import se.joshua.party.runner.domain.Player;
import se.joshua.party.runner.domainMapper.PlayerMapper;

import java.util.Set;

/**
 * @author Ali Yusha {@literal <mailto:Ali.yusha@so4it.com/>}
 */
public class PlayerServiceImpl implements PlayerService {

 private PlayerEntityDao playerEntityDao;


    public PlayerServiceImpl(PlayerEntityDao playerEntityDao) {
        this.playerEntityDao = playerEntityDao;
    }

    @Override
    public Player getPlayerByUserName(String userName) {
        return PlayerMapper.map(playerEntityDao.readByIdIfExists(userName));
    }

    @Override
    public void createPlayer(CreatePlayerRequest createPlayerRequest) {
        playerEntityDao.insert(PlayerMapper.map(createPlayerRequest));
    }

    @Override
    public Set<Player> getPlayers() {
        return PlayerMapper.map(playerEntityDao.readAll());
    }
}
