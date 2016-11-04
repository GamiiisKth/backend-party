package se.joshua.party.util;

import org.openspaces.remoting.RemoteResultReducer;
import org.openspaces.remoting.SpaceRemotingInvocation;
import org.openspaces.remoting.SpaceRemotingResult;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class SummarizeIntegersResultReducer<T,V> implements RemoteResultReducer<Integer,Integer> {

    public Integer reduce(SpaceRemotingResult<Integer>[] spaceRemotingResults, SpaceRemotingInvocation remotingInvocation) throws Exception {

        int result = 0;
        for (SpaceRemotingResult<Integer> spaceRemotingResult : spaceRemotingResults) {
            if (spaceRemotingResult.getException() != null) {
                throw (Exception) spaceRemotingResult.getException();
            }
            result += spaceRemotingResult.getResult().intValue();
        }
        return Integer.valueOf(result);
    }

}