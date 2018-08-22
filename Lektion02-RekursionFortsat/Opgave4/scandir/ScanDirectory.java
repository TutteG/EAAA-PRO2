package scandir;

import java.io.File;

public class ScanDirectory {

	public static int scanDir(String path) {
		int counter = 0;
		return counter += scanDir(path, counter + 1);
	}

	public static int scanDir(String path, int counter) {
		System.out.println("[DIR] " + path);
		File file = new File(path);
		String[] names = file.list();
		for (String name : names) {
			String newPath = path + "/" + name;
			if ((new File(newPath)).isDirectory()) {
				System.out.println(counter);
				counter = scanDir(newPath, counter + 1);
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		System.out.println(scanDir("C:\\Users\\Torbe\\Dropbox\\EAAA-Datamatiker\\Workspace\\EclipseSW"));
	}
}
