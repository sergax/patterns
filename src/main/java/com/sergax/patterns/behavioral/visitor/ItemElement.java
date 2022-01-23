package com.sergax.patterns.behavioral.visitor;

public interface ItemElement {
    public int accept(ShoppingCartVisitor visitor);
}
