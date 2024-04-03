package annotations;

import java.lang.annotation.*;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;


//Annotations are  basically on 4 levels : Class ,Fields, Methods ,Interfaces
//But we can customize an Annotation 
//replace class keyword with @interface
//This is an Annotation


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ToDoList {      //This is not an interface

	//99% times RUNTIME will be used
}
