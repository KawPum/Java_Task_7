package ru.mirea.diro.ikbo1919;

import Dishes.Cup;
import Dishes.FryingPan;
import Dogs.GoldenRetriever;
import Dogs.Shepherd;

public class Main {

    public static void main(String[] args) {
	    Cup cup = new Cup("plastic", 90, 164, 3, 10);
	    System.out.println(cup);
	    FryingPan pan = new FryingPan("aluminium", 2698, 660, 10, 3);
	    System.out.println(pan);
        GoldenRetriever retriever = new GoldenRetriever(56, 40);
        System.out.println(retriever);
        Shepherd shepherd = new Shepherd(15, 25);
        System.out.println(shepherd);
    }
}
