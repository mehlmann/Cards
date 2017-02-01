package com.example.batman.cards;

import java.io.Serializable;

/**
 * This class models a vocable which consists of the german translation and the corresponding
 * japanese words written only in hiragana/katakana(easy) or with kanji(hard)
 */

public class Vocable implements Serializable {

    private String vocable_german;
    private String vocable_japanese_easy;
    private String vocable_japanese_hard;

    public Vocable(String german, String japanese_easy, String japanese_hard) {
        this.vocable_german = german;
        this.vocable_japanese_easy = japanese_easy;
        this.vocable_japanese_hard = japanese_hard;
    }

    public String get_vocable_german() {
        return vocable_german;
    }

    public void set_vocable_german(String new_vocable) {
        this.vocable_german = new_vocable;
    }

    public String get_vocable_japanese_easy() {
        return vocable_japanese_easy;
    }

    public void set_vocable_japanese_easy(String new_vocable) {
        this.vocable_japanese_easy = new_vocable;
    }

    public String get_vocable_japanese_hard() {
        return vocable_japanese_hard;
    }

    public void set_vocable_japanese_hard(String new_vocable) {
        this.vocable_japanese_hard = new_vocable;
    }
}
