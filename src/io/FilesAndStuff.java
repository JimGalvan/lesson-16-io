package io;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

public class FilesAndStuff {
	public static void main(String[] args) throws IOException {
		
		File file = new File("src/pasta");
		file.createNewFile();
		System.out.println(file.getAbsolutePath()); 	//absolute path
		System.out.println(file.getPath());             //relative path
		
		/* Writing to a file using commons.io */
		FileUtils.write(file, "wine", false);
		
		/* Reading a file using commons.io */
		String fileContents = IOUtils.toString(file.toURI());
		System.out.println("pasta contains: " + fileContents);
		
		File filesAndStuff = new File("src\\io\\FilesAndStuff.java");
		File SongFinder = new File("src\\io\\SongFinder.java");
		
		
		List<String> lines = FileUtils.readLines(filesAndStuff, 
                StandardCharsets.UTF_8.name());		
		
		String lineCopyRight = lines.get(lines.size() -1);
		
		List<String> lines2 = FileUtils.readLines(SongFinder, 
                StandardCharsets.UTF_8.name());		
		
		String linesSongFinder = lines2.get(lines.size() -1);


		if (!lineCopyRight.contains("Copyright")) {
			FileUtils.write(filesAndStuff, "// Copyright Jim Galvan, 2020", true);
		} 
		if (!linesSongFinder.contains("Copyright")) {
			FileUtils.write(SongFinder, "// Copyright Jim Galvan, 2020", true);
		} 
		
	}
} 
// Copyright Jim Galvan, 2020