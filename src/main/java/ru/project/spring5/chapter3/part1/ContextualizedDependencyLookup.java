package ru.project.spring5.chapter3.part1;

import com.sun.tracing.dtrace.DependencyClass;

public class ContextualizedDependencyLookup implements ManagedComponent {

    private DependencyClass dependency;

    @Override
    public void performLookup(Container container) {
        this.dependency = (DependencyClass) container.getDependency("My dependency");
    }

    @Override
    public String toString() {
        return "ContextualizedDependencyLookup{" +
                "dependency=" + dependency +
                '}';
    }
}
