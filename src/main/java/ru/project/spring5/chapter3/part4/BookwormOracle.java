package ru.project.spring5.chapter3.part4;

import ru.project.spring5.chapter3.part3.Oracle;

public class BookwormOracle implements Oracle {

    private Encyclopedia encyclopedia;

    public BookwormOracle(Encyclopedia encyclopedia) {
        this.encyclopedia = encyclopedia;
    }

    @Override
    public String defineMeaningOfLife() {
        return "Encyclopedia - see the world instead";
    }
}
