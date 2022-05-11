package com.test7.annotations_autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor7 {
    private SpellChecker7 spellChecker;

    @Autowired
    public void setSpellChecker( SpellChecker7 spellChecker ){
        this.spellChecker = spellChecker;
    }
    public SpellChecker7 getSpellChecker( ) {
        return spellChecker;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}