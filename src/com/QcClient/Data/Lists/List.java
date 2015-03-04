/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QcClient.Data.Lists;
import com.QcClient.Tools.Serializer;
import org.simpleframework.xml.*;

/**
 *
 * @author kostenko
 */
public class List extends Serializer<List>{

    public List(Class<List> typeParameterClass) {
        super(typeParameterClass);
    }
    
    public String Id;
            
    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String Name;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    @ElementArray
    public Item[] Items;

    public Item[] getItems() {
        return Items;
    }

    public void setItems(Item[] Items) {
        this.Items = Items;
    }

}
