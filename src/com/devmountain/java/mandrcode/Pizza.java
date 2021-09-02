package com.devmountain.java.mandrcode;

public class Pizza {

    public Pizza(Builder builder) {
    }

    static class Builder{
        //mandatory
        private final int size;

        //default is false
        private boolean cheese;
        private boolean ham;

        Builder(int size){
            this.size =size;
        }
        Builder cheese (boolean value){
            cheese =value;
            return this;
        }

        Builder ham(boolean value){
            ham =value;
            return this;
        }

        Pizza build(){
            return new Pizza(this);
        }
    }
}
