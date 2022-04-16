package shared;

import android.os.Environment;

import java.io.File;
import java.io.FilenameFilter;

public class FileManager {

    public static File[] getAllFilesByDirectoryPath(String directoryPath) {
        System.out.println("getExternalStorageDirectory(): " + Environment.getStorageDirectory().toString() + directoryPath);
        File folder = new File(Environment.getExternalStorageDirectory().toString() + directoryPath);
        File[] files = folder.listFiles();
        return files;
    }
}