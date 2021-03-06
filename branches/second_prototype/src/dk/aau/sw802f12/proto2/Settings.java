package dk.aau.sw802f12.proto2;

import java.io.File;

public class Settings {

	private int libraryUpdateInterval = 60000;
	private File localMusicFolder = new File("/sdcard/Music");
	private String deviceName = "MyAndroidDevice";
	private int userInterfaceUpdateInterval = 500;

		
	public int getLibraryUpdateInterval() {
		return libraryUpdateInterval;
	}

	public void setLibraryUpdateInterval(int libraryUpdateInterval) {
		this.libraryUpdateInterval = libraryUpdateInterval;
	}
	
	public File getLocalMusicFolder() {
		return localMusicFolder;
	}

	public void setLocalMusicFolder(File localMusicFolder) {
		if (! localMusicFolder.isDirectory())
			throw new IllegalArgumentException();
		
		this.localMusicFolder = localMusicFolder;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	
	// Constructor ////////////////////////////////////////////////////////////
	private static Settings mInstance = null;
	public static Settings getInstance(){
		if( mInstance == null)
			mInstance = new Settings();
		return mInstance;
	}
	private Settings(){}

	public int getUserInterfaceUpdateInterval() {
		return userInterfaceUpdateInterval;
	}

	public void setUserInterfaceUpdateInterval(int userInterfaceUpdateInterval) {
		this.userInterfaceUpdateInterval = userInterfaceUpdateInterval;
	}

}
