package languaje_processor;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		if (args.length == 2) {
			MessageScanner scanner = new MessageScanner(args[0]);
			LanguageCorpus corpus = new LanguageCorpus(scanner);
			FileWriter file = new FileWriter(args[1]);
			corpus.exportCorpusToFile(file);			
		} else {
			System.err.println("You must specifie input file and output file");
		}
	}

}
