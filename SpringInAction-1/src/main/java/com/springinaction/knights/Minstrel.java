package com.springinaction.knights;

import java.io.PrintStream;

public class Minstrel {

    private PrintStream printStream;

    public Minstrel(final PrintStream printStream){
        this.printStream = printStream;
    }

    public void singBeforeQuest(){
        printStream.println("Tra la la: Jakiż rycerz jest dzielny!");
    }

    public void singAfterQuest(){
        printStream.println("Hip hip hura: Dzielny rycerz wypenij misje!");
    }

}
