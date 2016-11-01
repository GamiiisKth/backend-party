package se.joshua.party.dao;

import com.so4it.common.dao.gs.AbstractSpaceDao;
import org.openspaces.core.GigaSpace;
import se.joshua.party.runner.entity.PlayerEntity;

/**
 * @author Ali Yusha {@literal <mailto:Ali.yusha@so4it.com/>}
 */
public class PlayerEntityDaoImpl extends AbstractSpaceDao<PlayerEntity,String> implements PlayerEntityDao{

    public PlayerEntityDaoImpl(GigaSpace partyGigaSpace) {
        super(partyGigaSpace);
    }
}
