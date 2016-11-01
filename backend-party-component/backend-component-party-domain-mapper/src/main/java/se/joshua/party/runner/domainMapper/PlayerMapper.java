package se.joshua.party.runner.domainMapper;

import se.joshua.party.runner.domain.CreatePlayerRequest;
import se.joshua.party.runner.domain.Player;
import se.joshua.party.runner.entity.PlayerEntity;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class PlayerMapper {

    public static Player map(PlayerEntity playerEntity) {
        if (playerEntity == null) {
            return null;
        }
        return Player.builder()
                .withFirstName(playerEntity.getFirstName())
                .withLastName(playerEntity.getLastName())
                .withAttributes(playerEntity.getAttributes())
                .withEmail(playerEntity.getEmail())
                .withStartDate(playerEntity.getStartDate())
                .withEndDate(playerEntity.getEndDate())
                .withUserName(playerEntity.getUserName())
                .build();
    }


    public static Set<Player> map(PlayerEntity [] playerEntities){

        if (playerEntities==null){
            return null;
        }
        Set<Player> players= new HashSet<>();

        for (PlayerEntity entity :playerEntities){
            players.add(map(entity));
        }
        return players;
    }


    public static PlayerEntity map(CreatePlayerRequest createPlayerRequest){
        if (createPlayerRequest== null){
            return null;
        }
        return PlayerEntity.builder()
                .withFirstName(createPlayerRequest.getFirstName())
                .withLastName(createPlayerRequest.getLastName())
                .withAttributes(createPlayerRequest.getAttributes())
                .withEmail(createPlayerRequest.getEmail())
                .withStartDate(createPlayerRequest.getStartDate())
                .withEndDate(createPlayerRequest.getEndDate())
                .withUserName(createPlayerRequest.getUserName())
                .build();
    }



}
