package service;

import java.io.File;
import java.io.IOException;

import com.FileCopy;

public class FileCopierService {
	public static void copyFile(File source, File dest) throws IOException {
		FileCopy.copyFile(source, dest);
	}
}
