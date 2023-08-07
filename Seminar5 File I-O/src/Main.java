import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    private static final Random random = new Random();

    private static final int CHAR_BOUND_L = 65;
    private static final int CHAR_BOUND_H = 90;
    private static final String TO_SEARCH = "GeekBrains";

    public static void main(String[] args) throws IOException {

//        String str = generateSymbols(15);
//        System.out.println(str);
        writeFileContents("sample01.txt", 5);
        writeFileContents("sample02.txt", 5, 5);
        concatenation("sample01.txt", "sample02.txt", "sample03.txt");
        System.out.println(searchInFile("sample03.txt", "GeekBrains"));

        Tree.print(new File("."), "", true);

        String[] fileNames = new String[10];
        for (int i = 0; i < fileNames.length; i++) {
            fileNames[i] = "file" + i + ".txt";
            writeFileContents(fileNames[i], 10, 4);
            System.out.println("Add file" + i + ".txt");
        }
        List<String> result = searchMatch(fileNames, TO_SEARCH);
        for (String s : result) {
            System.out.printf("file %s soderzit '%s'\n", s, TO_SEARCH);
        }
    }

    /**
     * Метод генерации некоторой последовательности
     *
     * @param amount количество символово
     * @return последовательность символов
     */

    private static String generateSymbols(int amount) {
        StringBuilder stringBuilder = new StringBuilder(amount);
        for (int i = 0; i < amount; i++) {
            stringBuilder.append((char) random.nextInt(CHAR_BOUND_L, CHAR_BOUND_H + 1));
        }
        return stringBuilder.toString();
    }

    /**
     * Записать последовательность символов в файл
     *
     * @param fileName имя файла
     * @param length   длина последовательности символов
     * @throws IOException
     */
    private static void writeFileContents(String fileName, int length) throws IOException {
        /*FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        fileOutputStream.write(generateSymbols(length).getBytes());
        fileOutputStream.flush();
        fileOutputStream.close();*/

        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
            fileOutputStream.write(generateSymbols(length).getBytes());
        }
    }

    /**
     * Записать последовательность символов в файл
     *
     * @param fileName имя файла
     * @param length   длина последовательности символов
     * @param words    кол-во слов для поиска
     * @throws IOException
     */
    private static void writeFileContents(String fileName, int length, int words) throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
            for (int i = 0; i < words; i++) {
                if (random.nextInt(5) == 1) {
                    fileOutputStream.write(TO_SEARCH.getBytes());
                } else {
                    fileOutputStream.write(generateSymbols(length).getBytes());
                }
            }
            fileOutputStream.write(' ');
        }
    }

    private static void concatenation(String fileIn1, String fileIn2, String fileOut) throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileOut)) {
            int c;
            try (FileInputStream fileInputStream = new FileInputStream(fileIn1)) {
                while ((c = fileInputStream.read()) != -1) {
                    fileOutputStream.write(c);
                }
            }

            try (FileInputStream fileInputStream = new FileInputStream(fileIn2)) {
                while ((c = fileInputStream.read()) != -1) {
                    fileOutputStream.write(c);
                }
            }
        }
    }

    /**
     * Определить, содержится ли в файле искомое слово
     *
     * @param fileName имя файла
     * @param search   строка для поиска
     * @return результата поиска
     */

    private static boolean searchInFile(String fileName, String search) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            byte[] searchData = search.getBytes();
            int c;
            int i = 0;
            while ((c = fileInputStream.read()) != -1) {
                if (c == searchData[i]) {
                    i++;
                } else {
                    i = 0;
                    if (c == searchData[i]) {
                        i++;
                    }
                }
                if (i == searchData.length) {
                    return true;
                }
            }
            return false;
        }
    }

    private static List<String> searchMatch(String[] files, String search) throws IOException {
        List<String> list = new ArrayList<>();
        File path = new File(new File(".").getCanonicalPath());
        File[] dir = path.listFiles();
        for (int i = 0; i < dir.length; i++) {
            if (dir[i].isDirectory())
                continue;
            for (int j = 0; j < files.length; j++) {
                if (dir[i].getName().equals(files[j])) {
                    if (searchInFile(dir[i].getName(), search)) {
                        list.add(dir[i].getName());
                        break;
                    }
                }
            }
        }
        return list;
    }
}