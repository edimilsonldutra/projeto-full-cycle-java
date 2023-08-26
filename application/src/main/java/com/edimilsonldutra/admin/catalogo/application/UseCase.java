package com.edimilsonldutra.admin.catalogo.application;

import com.edimilsonldutra.admin.catalogo.domain.Category;

public class UseCase {
    public Category execute() {
        return new Category();
    }
}