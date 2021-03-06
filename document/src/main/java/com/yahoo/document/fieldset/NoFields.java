// Copyright 2017 Yahoo Holdings. Licensed under the terms of the Apache 2.0 license. See LICENSE in the project root.
package com.yahoo.document.fieldset;

/**
 * Created with IntelliJ IDEA.
 * User: thomasg
 * Date: 4/25/12
 * Time: 3:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class NoFields implements FieldSet {
    @Override
    public boolean contains(FieldSet o) {
        return (o instanceof NoFields);
    }

    @Override
    public FieldSet clone() throws CloneNotSupportedException {
        return new NoFields();
    }
}
