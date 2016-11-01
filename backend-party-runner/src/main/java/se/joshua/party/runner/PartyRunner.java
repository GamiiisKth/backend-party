package se.joshua.party.runner;

import com.so4it.test.gs.runner.GigaSpaceClusterRunner;
import com.so4it.test.gs.runner.GigaSpaceClusterRunnerImpl;

/**
 * @author Ali Yusha {@literal <mailto:Ali.yusha@so4it.com/>}
 */
public class PartyRunner {


    private static final int NUMBER_OF_PRIMARIES = 1;
    private static final int NUMBER_OF_BACKUPS = 0;
    public static final String LOOKUP_GROUP_NAME = "test";
    public static final String LOCAL_HOST = "127.0.0.1";


    private static final String[] PUS = {
            "classpath*:pu-party-component.xml"
    };


    public static void main(String[] args) throws Exception {
        for (String pu : PUS) {
            GigaSpaceClusterRunner partySpaceClusterRunner = GigaSpaceClusterRunnerImpl.builder()
                    .withConfigLocation(pu)
                    .withLookupLocator(LOCAL_HOST)
                    .withLookupGroup(LOOKUP_GROUP_NAME)
                    .withNumberOfPrimaries(NUMBER_OF_PRIMARIES)
                    .withNumberOfBackups(NUMBER_OF_BACKUPS)
                    .shouldStartEmbeddedLookupService(false)
                    .build();
            partySpaceClusterRunner.run();

        }
    }



}
