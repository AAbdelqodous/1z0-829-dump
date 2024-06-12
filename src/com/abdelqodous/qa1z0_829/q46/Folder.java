package com.abdelqodous.qa1z0_829.q46;

import java.io.Closeable;
import java.io.IOException;

//class Folder extends Closeable {
class Folder implements AutoCloseable{              // line 1
//    class Folder extends Exception {              // Error in try-with-resource

    @Override
    public void close() throws IOException {        // line 2
//    final void close()  {
        System.out.println("Close ");
    }

    public void open(){
        System.out.println("Open");
    }


}
