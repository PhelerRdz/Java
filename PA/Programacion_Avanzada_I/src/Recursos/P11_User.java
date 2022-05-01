/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursos;

/**
 *
 * @author GuillermoToledano
 */
public class P11_User {
    private String NAME;
    private String LAST;
    private String NUMBR;
    private String EMAIL;
    private boolean DONTR;

    public P11_User() {
    }

    public P11_User(String NAME, String LAST, String NUMBR, String EMAIL, boolean DONTR) {
        this.NAME = NAME;
        this.LAST = LAST;
        this.NUMBR = NUMBR;
        this.EMAIL = EMAIL;
        this.DONTR = DONTR;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getLAST() {
        return LAST;
    }

    public void setLAST(String LAST) {
        this.LAST = LAST;
    }

    public String getNUMBR() {
        return NUMBR;
    }

    public void setNUMBR(String NUMBR) {
        this.NUMBR = NUMBR;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public boolean isDONTR() {
        return DONTR;
    }

    public void setDONTR(boolean DONTR) {
        this.DONTR = DONTR;
    }

    @Override
    public String toString() {
        return "Name: " + this.NAME + "\n" + "Last Name: " + this.LAST + "\n" +
                "Number: " + this.NUMBR + "\n" + "eMail: " + this.EMAIL + "\n" +
                "Donator: " + this.DONTR + "\n";
    }    
}
