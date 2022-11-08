package org.aop;

import org.springframework.stereotype.Component;
// @ say that from this class SprCont will be taken Beans
@Component ("libraryBean")
public class Library {

    /**
     * Take signature of method and PUT into
     * @see org.aop.aspects.LoggingAspects
     */
    public void getBook(){
        System.out.println("We taking BooK");
    }
}
