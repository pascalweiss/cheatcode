package org.example.files;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * The tested functions are marked as @Beta by google. In the guava readme there is the following warning:
 *
 * "APIs marked with the @Beta annotation at the class or method level are subject to change. They can be modified in
 * any way, or even removed, at any time. If your code is a library itself (i.e., it is used on the CLASSPATH of users
 * outside your own control), you should not use beta APIs unless you repackage them. If your code is a library, we
 * strongly recommend using the Guava Beta Checker to ensure that you do not use any @Beta APIs!"
 */
public class GuavaIOTest {
    File file = new File("src/test/java/org/example/files/testData.json");

    @Test
    public void readToStringList() throws IOException {
        List<String> strings = Files.readLines(file, Charsets.UTF_8);

        assertThat(strings).hasSize(7);
        assertThat(strings.get(1)).isEqualTo("  \"foo\": \"some text\",");
    }
}
