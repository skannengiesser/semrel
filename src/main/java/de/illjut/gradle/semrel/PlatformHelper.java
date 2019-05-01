package de.illjut.gradle.semrel;

class PlatformHelper {
  private static String OS = System.getProperty("os.name").toLowerCase();
	public static boolean isWindows() {
		return (OS.indexOf("win") >= 0);
	}

	public static boolean isMac() {
		return (OS.indexOf("mac") >= 0);
	}

	public static boolean isUnix() {
		return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0 );
  }
  
  public static String getPlatform() {
    if (isWindows()) return "win";
    if (isUnix()) return "linux";
    if (isMac()) return "darwin";

    return null;
  }

  public static String getArch() {
    String result = System.getProperty("os.arch").toLowerCase();

    if(result.contains("64")) {
      return "x64";
    }

    if(result.equals("arm")) {
      throw new RuntimeException("Unsupported architecture: " + result);
    }

    return "x86";
  }

}