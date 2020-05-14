package org.example.files;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;/**/

import static org.assertj.core.api.Assertions.assertThat;

public class JavaNioTest {

    Path path = Paths.get("src", "test", "java", "org", "example", "files", "testData.json");

    @Test
    public void readLines() throws IOException {
        List<String> strings = Files.readAllLines(path, StandardCharsets.UTF_8);
        assertThat(strings).hasSize(7);
    }
}
