package ro.fasttrackit;

public class Persoana {
    public String myName = "Simo Attila Tamas";
    public char[] myInitials = {'S','A','T'};
    public String myGender = "male";
    public boolean married = false;
    public int myAge = 34;
    public float myHeight = 1.75f;
    public int myWeight = 85;

    public char[] getMyInitials() {
        return myInitials;
    }
    public String getMyName(){
        return myName;
    }
    public boolean married(){
        return false;
    }
    public String myGender() {
        return myGender;
    }
    public int getMyAge(){
        return myAge;
    }
    public float myHeight(){
        return myHeight;
    }
    public int getMyWeight(){
        return myWeight;
    }
    public void myimc(){
        System.out.println("Indice masa corporala : " + myWeight / (myHeight * myHeight));
    }
}







