package org.aop;

import org.springframework.stereotype.Component;
// @ say that from this class SprCont will be taken Beans
@Component ("libraryBean")
public class Library {

    public void getBook(){
        System.out.println("We taking BooK");
    }
}
