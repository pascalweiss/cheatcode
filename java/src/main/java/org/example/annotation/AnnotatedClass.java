package org.example.annotation;

import org.example.annotation.annotations.MethodAnnotation;
import org.example.annotation.annotations.TypeAnnotation;

@TypeAnnotation(foo = "such a foo")
public class AnnotatedClass {

    @MethodAnnotation(foo = "such a foo")
    public void fooRuntime() { }
}
