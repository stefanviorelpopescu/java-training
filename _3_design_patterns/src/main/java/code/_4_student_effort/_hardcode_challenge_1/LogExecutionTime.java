package code._4_student_effort._hardcode_challenge_1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Directives needed to have retention policy on user defined annotations so they can be read with reflection
// By declaring this directive, the annotation can be accessed via reflection at runtime.
// If this directive is not set, the annotation will not be preserved at runtime,
// and thus not available via reflection.
@Retention(RetentionPolicy.RUNTIME)
// By declaring this directive, the annotation can only be used on top of types (classes and interfaces typically).
// It can be also specified METHOD or FIELD, or it can be left the target out all together so the annotation
// can be used for both classes, methods and fields (using TYPE) TODO[TYPE not working]
@Target(ElementType.METHOD)
public @interface LogExecutionTime {

}
