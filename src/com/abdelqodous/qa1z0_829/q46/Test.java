package com.abdelqodous.qa1z0_829.q46;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {

        try( Folder f = new Folder()){
            f.open();
        }
    }
}
