package org.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {

        // Do scan for looking available Bean
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        // Use reflection to set to link Bean
        Library library = context.getBean("libraryBean", Library.class);
        SecondLibrary sl = context.getBean("secondLibrary", SecondLibrary.class);
        library.getBook();
        sl.getBook();

        context.close();
    }
}
