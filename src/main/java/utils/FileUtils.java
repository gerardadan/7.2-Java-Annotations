package utils;

import java.io.File;

public class FileUtils {

    public static String getProjectPath() throws IllegalArgumentException {
        String filePath = System.getProperty("user.dir");
        File file = new File(filePath);

        return file.getAbsolutePath();
    }

    public static String getAbsoluteFilePath(String path) throws IllegalArgumentException {
        File file = new File(path);
        if (!file.exists()) {
            throw new IllegalArgumentException("File not exist : " + path);
        }

        return file.getAbsolutePath();
    }

    public static File[] getAllFilesFromDir(File dir) {
        if (dir.exists() && dir.isDirectory()) {
            return dir.listFiles();
        } else {
            return new File[0];
        }
    }
}