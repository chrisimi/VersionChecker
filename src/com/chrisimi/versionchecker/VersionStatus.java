package com.chrisimi.versionchecker;

/**
 * the status of the version checker
 */
public enum VersionStatus
{
    /**
     * the local plugin has another version than the current version on spigotmc
     */
    OUTDATED,

    /**
     * the local plugin has the the same version as the current version on spigotmc
     */
    UP_TO_DATE,

    /**
     * an error occurred while trying to check the version from spigot and plugin.yml perhaps you used an invalid plugin id
     */
    ERROR
}
