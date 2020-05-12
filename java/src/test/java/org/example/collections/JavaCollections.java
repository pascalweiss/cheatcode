package org.example.collections;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * This test shows how to create various Java collections
 */
public class JavaCollections {

    @Test public void arrays() {
        Integer[] b = {1,2,3};
    }

    @Test public void lists() {
        Arrays.asList(1, 2, 3);
        List.of(1, 2, 3); // >= Java 9, && Immutable
    }

    @Test public void sets() {
        new HashSet<>();
        new HashSet<>(Arrays.asList(1, 2, 3, 6));
        Set.of(1, 2, 3);  // >= Java 9 && Immutable
    }

    @Test public void maps() {
        new HashMap<>();
        Map.of("a",1,"b",2); // >= Java 9 && Immutable
    }
}
