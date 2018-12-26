package com.example.testng.Annotation.Listener;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyITestNGListenerImp.class)
public class ListenerAnnotationTest {


    @Test
    public void ListenerTest() {
        System.err.println(this.getClass().getSimpleName());
    }

}
