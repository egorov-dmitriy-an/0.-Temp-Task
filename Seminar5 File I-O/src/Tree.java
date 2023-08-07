import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Tree {

    public static void main(String[] args) {
        Tree.print(new File("."), "", true);
    }

    public static void print(File file, String indent, boolean isLast) {
        List<String> fileList = new ArrayList<>();

        System.out.print(indent);

        if (isLast) {
            System.out.print("|__");
            indent += "     ";
        } else {
            System.out.print("|--");
            indent += "|   ";
        }
        System.out.println(file.getName());

        File[] files = file.listFiles();
        if (files == null) return;

        int subDirTotal = 0;
        for (File f : files) {
            if (f.isDirectory())
                subDirTotal++;
        }
        for (File f : files) {
            if (f.isDirectory()) {
                print(f, indent, subDirTotal == files.length);
            } else {
                fileList.add(f.getName());
            }
        }
        for (int i = 0; i < fileList.size(); i++) {
            if (i != fileList.size() - 1) {
                System.out.println(indent + "|--" + fileList.get(i));
            } else System.out.println(indent + "|__" + fileList.get(i));
        }
    }
}
