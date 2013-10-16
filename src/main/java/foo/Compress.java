package foo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.commons.compress.archivers.ArchiveException;
import org.apache.commons.compress.archivers.ArchiveOutputStream;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.utils.IOUtils;

/**
 * Pakowanie do zip'a
 *
 */
public class Compress {
	public static void main(String[] args) throws ArchiveException, IOException{
	
    final File output = new File("out.zip");
    
    final File file1 = new File("myfile.txt");

    final OutputStream out = new FileOutputStream(output);

    final ArchiveOutputStream os = new ArchiveStreamFactory().createArchiveOutputStream("zip", out);

    os.putArchiveEntry(new ZipArchiveEntry("myfileInside.txt"));
    IOUtils.copy(new FileInputStream(file1), os);
    os.closeArchiveEntry();


    os.close();
    
    
 
///////////////////////////////////////////// Multiple Compress ////////////////////////////////////

	System.out.println("Example of multi ZIP file creation.");
	String filesToZip = "a.txt";
	String filesToZip2 = "b.txt";
	File file = new File(filesToZip);
	File file2 = new File(filesToZip2);

	final File output1 = new File("multiZip.zip");

	final OutputStream out1 = new FileOutputStream(output1);

	final ArchiveOutputStream os1 = new ArchiveStreamFactory().createArchiveOutputStream("zip", out1);

	os1.putArchiveEntry(new ZipArchiveEntry("a.txt"));
	IOUtils.copy(new FileInputStream(file), os1);
	os1.closeArchiveEntry();

	os1.putArchiveEntry(new ZipArchiveEntry("b.txt"));
	IOUtils.copy(new FileInputStream(file2), os1);
	os1.closeArchiveEntry();

	os1.close();

	}
}
