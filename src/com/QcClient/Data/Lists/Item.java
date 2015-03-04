/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QcClient.Data.Lists;

import com.QcClient.Tools.Serializer;
import org.simpleframework.xml.Attribute;

/**
 *
 * @author kostenko
 */
public class Item extends Serializer<Item>{
    
    public Item(Class<Item> typeParameterClass) {
        super(typeParameterClass);
    }

    @Attribute
    public String logicalName;

    public String getLogicalName() {
        return logicalName;
    }

    public void setLogicalName(String logicalName) {
        this.logicalName = logicalName;
    }
      
    @Attribute
    public String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
        
}
