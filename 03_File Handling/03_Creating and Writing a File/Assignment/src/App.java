import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        String FILE_NAME = "src/starter.txt";
        String newFile = "src/ender.txt";

        Path filePath = Paths.get(FILE_NAME);
        List<String> lines = Files.readAllLines(filePath);

        // create file using notes from yesterday 53-55
        FileWriter fileWriter = new FileWriter(newFile, true);
        BufferedWriter writer = new BufferedWriter(fileWriter);

        for (var line : lines) {
            // write line to file using append in the notes
            writer.append(line);
            writer.append("\n");

        }
        writer.close();

    }
}
