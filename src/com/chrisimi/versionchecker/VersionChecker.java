package com.chrisimi.versionchecker;

import jdk.internal.util.xml.impl.Input;
import org.bukkit.plugin.java.JavaPlugin;
import sun.misc.Version;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class VersionChecker
{
    /**
     * the prepared URL for checking after the update
     */
    private static final String SPIGOT_URL = "https://api.spigotmc.org/legacy/update.php?resource=%s";
    /**
     * get the status for this plugin
     * @param plugin the {@linkplain JavaPlugin} instance of the plugin
     * @param id the id from the spigot mc website
     * @return {@linkplain VersionStatus} status which represents the result
     */
    public static VersionStatus getStatus(JavaPlugin plugin, String id)
    {
        //TODO implement
        return null;
    }


    private static String getSpigotVersion(String id)
    {
        BufferedReader reader = null;
        try
        {
            String url = String.format(SPIGOT_URL, id);

            HttpsURLConnection connection = (HttpsURLConnection) new URL(url).openConnection();

            //configure connection
            connection.setRequestMethod("GET");
            connection.setReadTimeout(2000);
            connection.setDoOutput(true);
            connection.setConnectTimeout(2000);

            //connect
            connection.connect();

            //get data from website
            StringBuilder sb = new StringBuilder();
             reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line = "";

            while((line = reader.readLine()) != null)
                sb.append(line);

            return sb.toString();

        } catch(Exception e)
        {
            return "";
        }
        finally
        {
            if(reader != null)
            {
                try
                {
                    reader.close();
                } catch (IOException e)
                {

                }
            }
        }
    }
}
