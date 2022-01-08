package resource;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class NameReaderImpl implements NameReader{
    @Override
    public List<String> read(String path) {
        Path fileName = Path.of(path);

        List<String> lines = Collections.emptyList();
        try {
            lines = Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return lines;
    }
}
