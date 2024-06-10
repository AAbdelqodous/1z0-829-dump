package com.abdelqodous.qa1z0_829.q11;

abstract sealed interface SInt permits Story, Art {
    default String getTitle(){
        return "Book Title";
    }
}
