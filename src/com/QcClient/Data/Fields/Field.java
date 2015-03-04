/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QcClient.Data.Fields;

import com.QcClient.Tools.Serializer;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

/**
 *
 * @author kostenko
 */
@Attribute
public class Field extends Serializer<Field>{
    
    public Field(Class<Field> typeParameterClass) {
        super(typeParameterClass);
    }
    
    @Element(name = "List-Id")
    public String ListId;

    public String getListId() {
        return ListId;
    }

    public void setListId(String ListId) {
        this.ListId = ListId;
    }


    public String Type;

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }



    @Attribute
    public String Name;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }


    @Attribute
    public String Label;

    public String getLabel() {
        return Label;
    }

    public void setLabel(String Label) {
        this.Label = Label;
    }
    
    @Attribute
    public String PhysicalName;

    public String getPhysicalName() {
        return PhysicalName;
    }

    public void setPhysicalName(String PhysicalName) {
        this.PhysicalName = PhysicalName;
    }
    
}
