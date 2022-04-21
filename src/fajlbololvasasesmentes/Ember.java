/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fajlbololvasasesmentes;

/**
 *
 * @author Varadi.Akos
 */
public class Ember {
    private String nev,nem;
    private int kor,mnkaToltottEvek;

    public Ember(String nev,int kor, String nem ) {
        this(nev,kor,nem,0);
        
    }

    public Ember(String nev,int kor, String nem,  int mnkaToltottEvek) {
        this.nev = nev;
        this.kor = kor;
        this.nem = nem;
        this.mnkaToltottEvek = mnkaToltottEvek;
    }

    public String getNev() {
        return nev;
    }

    public String getNem() {
        return nem;
    }

    public int getKor() {
        return kor;
    }

    public int getMnkaToltottEvek() {
        return mnkaToltottEvek;
    }

    @Override
    public String toString() {
        return "Ember{" + "nev=" + nev + ", nem=" + nem + ", kor=" + kor + ", mnkaToltottEvek=" + mnkaToltottEvek + '}';
    }
    
    
    
    
          
}
