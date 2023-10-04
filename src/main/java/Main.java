import java.io.*;

public class Main {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        File dir1 = new File("Games//src");
        if (dir1.mkdir()) {
            builder.append("Созданы папки: \n");
            builder.append(dir1.getName());
            builder.append("\n");
        }

        File dir2 = new File("Games//res");
        if (dir2.mkdir()) {
            builder.append(dir2.getName());
            builder.append("\n");
        }

        File dir3 = new File("Games//savegames");
        if (dir3.mkdir()) {
            builder.append(dir3.getName());
            builder.append("\n");
        }

        File dir4 = new File("Games//temp");
        if (dir4.mkdir()) {
            builder.append(dir4.getName());
            builder.append("\n");
        }

        File dir1_1 = new File(dir1, "main");
        if (dir1_1.mkdir()) {
            builder.append(dir1_1.getName());
            builder.append("\n");
        }

        File dir1_2 = new File(dir1, "test");
        if (dir1_2.mkdir()) {
            builder.append(dir1_2.getName());
            builder.append("\n");
        }

        File dir2_1 = new File(dir2, "drawables");
        File dir2_2 = new File(dir2, "vectors");
        File dir2_3 = new File(dir2, "icons");
        if(dir2_1.mkdir() && dir2_2.mkdir() && dir2_3.mkdir()) {
            builder.append(dir2_1.getName());
            builder.append("\n");
            builder.append(dir2_2.getName());
            builder.append("\n");
            builder.append(dir2_3.getName());
            builder.append("\n");
        }

        try {
            File file1_1_1 = new File(dir1_1, "Main.java");
            if (file1_1_1.createNewFile()) {
                builder.append("Созданы файлы: \n");
                builder.append(file1_1_1.getName());
                builder.append("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            File file1_1_2 = new File(dir1_1, "Utils.java");
            if (file1_1_2.createNewFile()) {
                builder.append(file1_1_2.getName());
                builder.append("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File file4_1 = new File(dir4, "temp.txt");
        try (FileWriter writer = new FileWriter(file4_1, false)) {
            writer.write(String.valueOf(builder));
            System.out.println("Записано!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
