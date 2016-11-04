package se.joshua.party.service;

import org.openspaces.remoting.RemoteResultReducer;
import org.openspaces.remoting.SpaceRemotingInvocation;
import org.openspaces.remoting.SpaceRemotingResult;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class ObjectListResultReducer <T> implements RemoteResultReducer<Set, Set> {

    public Set reduce(SpaceRemotingResult<Set>[] spaceRemotingResults, SpaceRemotingInvocation remotingInvocation) throws Exception {
        Set<T> result = new HashSet<T>();
        for(SpaceRemotingResult<Set> spaceRemotingResult : spaceRemotingResults){
            if(spaceRemotingResult.getException() != null){
                throw (Exception)spaceRemotingResult.getException();
            }
            result.addAll(spaceRemotingResult.getResult());
        }
        return result;
    }


}
