/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QcClient.Data.Entities;
import com.QcClient.Tools.Serializer;
import org.simpleframework.xml.*;

/**
 *
 * @author kostenko
 */
@Root
@Namespace(reference="")
@Attribute(empty = "", required = true)
public class Entities extends Serializer<Entities>{    
    public Entities(Class<Entities> typeParameterClass) {
        super(typeParameterClass);
    }

    @Attribute(name = "Entity")
    public Entity[] Entity;

    public Entity[] getEntity() {
        return Entity;
    }

    public void setEntity(Entity[] Entity) {
        this.Entity = Entity;
    }

    @Attribute
    public int TotalResults;

    public int getTotalResults() {
        return TotalResults;
    }

    public void setTotalResults(int TotalResults) {
        this.TotalResults = TotalResults;
    }

}



