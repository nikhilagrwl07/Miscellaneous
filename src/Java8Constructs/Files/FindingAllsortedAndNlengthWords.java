package Java8Constructs.Files;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by nikhilagrawal on 21/02/17.
 */
public class FindingAllsortedAndNlengthWords {
    public static void main(String[] args) throws IOException {
        int n=5;

        List<String> distinctSortedNlengthWords = Files.lines(Paths.get("/Users/nikhilagrawal/Documents/Miscellaneous/src/Java8Constructs/Files/words.txt"))
                                                        .filter(s -> s.length() == n)
                                                        .map(String::toUpperCase)
                                                        .distinct()
                                                        .sorted()
                                                        .collect(Collectors.toList());
        Files.write(Paths.get("/Users/nikhilagrawal/Documents/Miscellaneous/src/Java8Constructs/Files/out.txt"),distinctSortedNlengthWords, Charset.defaultCharset());

    }
}
