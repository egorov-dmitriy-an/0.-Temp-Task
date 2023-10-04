import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BackUp {
    public static void main(String[] args) throws IOException {
        File file = new File(Path.of(".").toUri());
        File[] startDir = file.listFiles();
        Path endDir = Files.createDirectory(Paths.get("./backup"));
        backUp(startDir, endDir);
    }

    public static void backUp(File[] files, Path dir) throws IOException {
        if (files == null) return;
        for (File f : files) {
            if (f.isDirectory()) {
                backUp(f.listFiles(), dir);
            } else {
                Path result = Paths.get(dir + "/" + f.getName());
                Files.copy(f.toPath(), result);
            }
        }
    }
}
