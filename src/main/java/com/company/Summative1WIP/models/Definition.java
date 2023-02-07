package com.company.Summative1WIP.models;

public class Definition {
    private int id;

    private String word;

    private String definition;

    public Definition(String word, String definition, int id){
        this.word = word;
        this.definition = definition;
        this.id = id;
    }

    public Definition(){}

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
