package se.joshua.party.service;

import se.joshua.party.dao.PlayerEntityDao;
import se.joshua.party.domain.CreatePlayerRequest;
import se.joshua.party.domain.Player;
import se.joshua.party.domainMapper.PlayerMapper;

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
    public Player getPlayer(String userName) {
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
