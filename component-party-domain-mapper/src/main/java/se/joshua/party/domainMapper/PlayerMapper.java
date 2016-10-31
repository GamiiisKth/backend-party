package se.joshua.party.domainMapper;

import se.joshua.party.domain.Player;
import se.joshua.party.entity.SpacePlayer;

import java.util.List;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class PlayerMapper {

    public static Player map(SpacePlayer spacePlayer) {
        if (spacePlayer == null) {
            return null;
        }
        return Player.builder()
                .withFirstName(spacePlayer.getFirstName())
                .withLastName(spacePlayer.getLastName())
                .withAttributes(spacePlayer.getAttributes())
                .withEmail(spacePlayer.getEmail())
                .withStartDate(spacePlayer.getStartDate())
                .withEndDate(spacePlayer.getEndDate())
                .withUserName(spacePlayer.getUserName())
                .build();
    }


    public static SpacePlayer map(Player player){

        if (player== null){
            return null;
        }
        return SpacePlayer.builder()
                .withFirstName(player.getFirstName())
                .withLastName(player.getLastName())
                .withAttributes(player.getAttributes())
                .withEmail(player.getEmail())
                .withStartDate(player.getStartDate())
                .withEndDate(player.getEndDate())
                .withUserName(player.getUserName())
                .build();
    }



}
