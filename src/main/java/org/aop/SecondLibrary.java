package org.aop;

import org.springframework.stereotype.Component;
// @ say that from this class SprCont will be taken Beans
@Component ("secondLibrary")
public class SecondLibrary extends AbstrLibrary {

    /**
     * Take signature of method and PUT into
     * @see org.aop.aspects.LoggingAspects
     */
    public void getBook(){
        System.out.println("We taking BooK Two ");
    }
}
