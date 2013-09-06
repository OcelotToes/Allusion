package allusion.version;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import allsion.lib.Reference;

public class VersionCheck {

	public static boolean isUpDateAvailable() throws IOException, MalformedURLException{
		BufferedReader versionFile = new BufferedReader(new InputStreamReader(new URL
			("https://raw.github.com/Allusion/Allusion/master/version/version.txt").openStream()));
		String newVersion = versionFile.readLine();
		String clientVersion = Reference.version;
		if (!clientVersion.equals(newVersion)){
			return true;
		} else{
		return false;	
		}
	}
}
