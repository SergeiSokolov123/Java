import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    private static final int NEW_WIDTH = 300;
    private static final int CORES = Runtime.getRuntime().availableProcessors();

    public static void main(String[] args) {
        String srcFolder = "C://Users//Сережа//Desktop//FolderFrom";
        String dstFolder = "C://Users//Сережа//Desktop//FolderTo";

        File srcDir = new File(srcFolder);
        long start = System.currentTimeMillis();
        File[] files = srcDir.listFiles();

        resize(dstFolder, start, files);

    }

    private static void resize(String dstFolder, long start, File[] files) {
        int countElements = files.length;
        int part = countElements / CORES;
        int step = 0;

        for (int i = 1; i < CORES; i++) {
            File[] filesForResizing = new File[part];
            System.arraycopy(files, step, filesForResizing, 0, filesForResizing.length);
            ImageResizer resizer1 = new ImageResizer(filesForResizing, NEW_WIDTH, dstFolder, start);
            new Thread(resizer1).start();
            step += part;
            countElements -= part;
        }
        File[] lastFilesForResizing = new File[countElements];
        System.arraycopy(files, step, lastFilesForResizing, 0, lastFilesForResizing.length);
        ImageResizer lastResizer = new ImageResizer(lastFilesForResizing, NEW_WIDTH, dstFolder, start);
        new Thread(lastResizer).start();

    }
}