package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ExSumFileLength {

    public static void main(String[] args) throws IOException{

        Path initalDir = Path.of("");
        System.out.println(initalDir.toAbsolutePath());

        System.out.println(calculateSize(initalDir));

    }

    private static long calculateSize(Path initialDir) throws IOException {
        long totalSize = 0;
        try (var files = Files.newDirectoryStream(initialDir)) {
            for (Path file : files) {
                if (Files.isDirectory(file)) {
                    totalSize += calculateSize(file);
                } else {
                    totalSize += Files.size(file);
                }
            }
        }
        return totalSize;
    }
}
