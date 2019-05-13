package sb_rdtrip_tester;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import org.sbolstandard.core2.SBOLConversionException;
import org.sbolstandard.core2.SBOLDocument;
import org.sbolstandard.core2.SBOLValidationException;
import org.synbiohub.frontend.SynBioHubException;

public class SynBioHubRunner {

	public static void main(String[] args) {

		try {
			if (args.length < 3)
				throw new IOException();
		} catch (IOException e1) {
			System.err.println("Please provide the file to read, emulated, and retrieved files' path.\n\n");
			e1.printStackTrace();
			System.exit(1);
			
		}
		String orig_file = args[0];
		File read_file = new File(orig_file);
		String emulated_file_path = args[1];
		String retrieved_file_path = args[2];
		String timing_file_path = null;
		if (args.length > 3) {
			timing_file_path = args[3];
		}
		SBOLDocument retrieved; 
		SBOLDocument emulated; 
		
		try {
			SynBioHubEmulator emulator = new SynBioHubEmulator(read_file,timing_file_path);
			try {
				retrieved = emulator.retrieveDoc(); 
				retrieved.write(retrieved_file_path);
				emulated = emulator.retrieveEmulatedDoc();
				emulated.write(emulated_file_path);
			} catch (IOException | SBOLConversionException e) {
				e.printStackTrace();
                System.exit(1);
			}
		} catch (SBOLValidationException | IOException | SBOLConversionException | SynBioHubException
				| URISyntaxException e) {
			System.err.println("SBH Emulator failed to initalize" + e.getMessage() + "\n"); 
			e.printStackTrace();
            System.exit(1);
		}
	}
}
