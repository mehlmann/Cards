package com.example.batman.cards;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * This class models a single Chapter of Minna no Nihongo. Contains the chapter's number and all
 * the vocables appearing in the chapter.
 */

public class Chapter implements Serializable {

    private int chap_nr;
    private ArrayList<Vocable> vocables;

    /*
        Constructor of the class Chapter.
     */
    public Chapter(int number){
        this.chap_nr = number;
        this.vocables = new ArrayList<>();
    }

    public int get_chap_nr() {
        return this.chap_nr;
    }

    public void set_chap_n(int new_chap_nr) {
        this.chap_nr = new_chap_nr;
    }

    public ArrayList<Vocable> get_vocables() {
        return this.vocables;
    }

    public void add_vocable(Vocable vocable) {
        vocables.add(vocable);
    }

    public void erase_vocables() {
        this.vocables = new ArrayList<>();
    }
}
