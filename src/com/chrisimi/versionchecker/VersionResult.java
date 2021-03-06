package com.chrisimi.versionchecker;

/**
 * represent the result of the VersionChecker
 */
public class VersionResult
{
    private final String spigotPluginVersion;
    private final String localPluginVersion;
    private final VersionStatus status;
    public VersionResult(String spigotVersion, String localPluginVersion, VersionStatus status)
    {
        this.spigotPluginVersion = spigotVersion;
        this.localPluginVersion = localPluginVersion;
        this.status = status;
    }

    /**
     * get the version of the plugin which the version checker got from spigotmc
     * @return String which contains the raw version from the current version on spigotmc
     */
    public String getSpigotPluginVersion()
    {
        return spigotPluginVersion;
    }

    /**
     * get the version of the plugin from the plugin.yml
     * @return String which contains the raw version from the plugin.yml
     */
    public String getLocalPluginVersion()
    {
        return localPluginVersion;
    }

    /**
     * get the status of the version
     * @return {@linkplain VersionStatus}
     */
    public VersionStatus getStatus()
    {
        return status;
    }
}
