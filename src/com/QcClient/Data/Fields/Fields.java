/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QcClient.Data.Fields;

import org.simpleframework.xml.*;
import com.QcClient.Tools.Serializer;
/**
 *
 * @author kostenko
 */
public class Fields extends Serializer<Fields>{
    
    public Fields(Class<Fields> typeParameterClass) {
        super(typeParameterClass);
    }
    
    @Element
    @Attribute(name = "Field")
    public Field[] Field;
    public Field[] getField() {
        return Field;
    }

    public void setField(Field[] Field) {
        this.Field = Field;
    }

}
