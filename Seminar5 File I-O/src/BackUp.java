import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BackUp {
    public static void main(String[] args) throws IOException {
        Path path = Files.createDirectory(Path.of("./backup"));
//        System.out.println(path);
        String s = path.toString();
//        System.out.println(s);

        Path test = Paths.get("./sample04.txt");

        s = s + "/sample04.txt";
        System.out.println(s);

        Path result = Paths.get(s);
        Files.copy(test, result);


    }
//
//    public static void backUp(File file = new File(String path)) throws IOException {
//        File[] files = file.listFiles();
//        if (files == null) return;
//
//        for (File f : files) {
//            if (f.isDirectory()) {
//                backUp(f);
//            } else {
//                Files.copy(f.toPath(), path.toPath());
//            };
//        }
//    }
}
