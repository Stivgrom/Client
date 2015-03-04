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
public class Lists extends Serializer<Lists>{
    
    public Lists(Class<Lists> typeParameterClass) {
        super(typeParameterClass);
    }
    
    @Element
    @Attribute(name = "List")
    public List[] List;

    public List[] getList() {
        return List;
    }

    public void setList(List[] List) {
        this.List = List;
    }
    
}
