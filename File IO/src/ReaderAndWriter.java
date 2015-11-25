import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class ReaderAndWriter {
    private File readFile;
    private File writeFile;

    public ReaderAndWriter(String readPath, String writePath) {
	readFile = new File(readPath);
	writeFile = new File(writePath);
    }

    public ArrayList<String> readMapFromFile() {
	ArrayList<String> result = new ArrayList<String>();
	try {
	    if (readFile.exists()) {
		BufferedReader input = new BufferedReader(new FileReader(readFile));
		String line = "";
		while ((line = input.readLine()) != null) {
		    // use container to receive
		    result.add(line);
		}

		input.close();
	    } else {
		throw new Exception("cannot find file");
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
	return result;
    }

    public String readMapFromFileInString() {
	String result = "";
	try {
	    if (readFile.exists()) {
		BufferedReader input = new BufferedReader(new FileReader(readFile));
		String line = "";
		while ((line = input.readLine()) != null) {
		    // use container to receive
		    result += line;
		}

		input.close();
	    } else {
		throw new Exception("cannot find file");
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
	return result;
    }

    public void writeMapIntoFile(String output) {
	try {
	    if (writeFile.exists()) {
		System.out.println("");
	    } else {
		System.out.println("file not exist to output");
		writeFile.createNewFile();
	    }

	    BufferedWriter writer = new BufferedWriter(new FileWriter(writeFile));
	    writer.write(output);
	    writer.close();
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}
