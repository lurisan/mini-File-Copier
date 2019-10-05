package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class FileCopy 
{
	public static void copyFile(File source, File dest) throws IOException 
	{
		dest.getParentFile().mkdirs(); 
	    dest.createNewFile();
	    
	    FileInputStream fileInputStream = new FileInputStream(source);
	    FileOutputStream fileOutputStream = new FileOutputStream(dest);
	    
	    FileChannel sourceChannel = fileInputStream.getChannel();
	    FileChannel destChannel = fileOutputStream.getChannel();
        
	    destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
        
	    sourceChannel.close();
        destChannel.close();
    	fileInputStream.close();
    	fileOutputStream.close();
        
    	source.delete();
    }
}
