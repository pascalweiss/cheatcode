package org.example;


import org.example.annotation.AnnotatedClass;
import org.example.annotation.annotations.MethodAnnotation;
import org.example.annotation.annotations.TypeAnnotation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnnotationTest {
    AnnotatedClass anno = new AnnotatedClass();

    @Test
    public void methodAnnotation() throws NoSuchMethodException {
        MethodAnnotation annotation = anno.getClass()
                .getDeclaredMethod("fooRuntime")
                .getAnnotation(MethodAnnotation.class);

        assertEquals(annotation.foo(), "such a foo");
        assertEquals(annotation.wat(), "wat");
    }

    @Test
    public void typeAnnotation() {
        TypeAnnotation annotation = anno.getClass().getAnnotation(TypeAnnotation.class);

        assertEquals(annotation.foo(), "such a foo");
        assertEquals(annotation.wat(), "wat");
    }
}
