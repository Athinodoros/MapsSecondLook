package mapComponents;

import java.io.IOException;
import java.util.logging.FileHandler;

/**
 * Created by Athinodoros on 16/2/2016.
 */
public class FileSystem extends FileHandler {
    public FileSystem(String pattern) throws IOException {
        super(pattern);
    }
}
