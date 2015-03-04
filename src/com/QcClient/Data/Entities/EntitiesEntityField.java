/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QcClient.Data.Entities;
import org.simpleframework.xml.*;
/**
 *
 * @author kostenko
 */
public class EntitiesEntityField {

    public String Value;

    public String getValue() {
        return Value;
    }

    public void setValue(String Value) {
        this.Value = Value;
    }

    @Attribute
    public String Name;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    } 
}
