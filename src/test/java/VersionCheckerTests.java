package test.java;

import com.chrisimi.versionchecker.VersionChecker;
import com.chrisimi.versionchecker.VersionResult;
import com.chrisimi.versionchecker.VersionStatus;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VersionCheckerTests
{
    @Test
    public void TestWithCasinoPlugin()
    {
        VersionResult result = VersionChecker.getStatus(null, "71898");
        assertEquals("3.7.1", result.getSpigotPluginVersion());
    }
}
