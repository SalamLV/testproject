package com.test6.autowiring;

public class TextEditor6 {
    private SpellChecker6 spellChecker;
    private String name;

    public void setSpellChecker( SpellChecker6 spellChecker ) {
        System.out.println("Inside TextEditor6 setSpellChecker");
        this.spellChecker = spellChecker;
    }
    public SpellChecker6 getSpellChecker() {
        return spellChecker;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
