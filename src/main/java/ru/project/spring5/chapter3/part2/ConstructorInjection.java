package ru.project.spring5.chapter3.part2;

public class ConstructorInjection {
    private Dependency dependency;

    //конструктор
    public ConstructorInjection(Dependency dependency) {
        this.dependency = dependency;
    }
    //сеттер
    public void setDependency(Dependency dependency) {
        this.dependency = dependency;
    }
}
