/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QcClient.Data.EntityResourceDescriptor;

import org.simpleframework.xml.*;
import com.QcClient.Tools.Serializer;

/**
 *
 * @author kostenko
 */
@Root
@Namespace(prefix = "")
@Attribute(required = true)
public class EntityDescriptor extends Serializer<EntityDescriptor>{

    public EntityDescriptor(Class<EntityDescriptor> typeParameterClass) {
        super(typeParameterClass);
    }

    
    @Attribute
    public String baseUrl;

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }


    @Attribute
    public String collectionName;

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }


    @Element
    @Attribute(name = "Table")
    public String Table;

    public String getTable() {
        return Table;
    }

    public void setTable(String Table) {
        this.Table = Table;
    }
    
    @Element
    @Attribute(name = "SupportsVC")
    public SupportsVC SupportsVC;

    public SupportsVC getSupportsVC() {
        return SupportsVC;
    }

    public void setSupportsVC(SupportsVC SupportsVC) {
        this.SupportsVC = SupportsVC;
    }
    

    @Element
    @Attribute(name = "SupportsLock")
    public SupportsLock SupportsLock;

    public SupportsLock getSupportsLock() {
        return SupportsLock;
    }

    public void setSupportsLock(SupportsLock SupportsLock) {
        this.SupportsLock = SupportsLock;
    }
    
    @Element
    @Attribute(name = "SupportsAttachment")
    public SupportsAttachment SupportsAttachment;

    public SupportsAttachment getSupportsAttachment() {
        return SupportsAttachment;
    }

    public void setSupportsAttachment(SupportsAttachment SupportsAttachment) {
        this.SupportsAttachment = SupportsAttachment;
    }

    @Element
    @Attribute(name = "SupportsMultiValue")
    public SupportsMultiValue SupportsMultiValue;

    public SupportsMultiValue getSupportsMultiValue() {
        return SupportsMultiValue;
    }

    public void setSupportsMultiValue(SupportsMultiValue SupportsMultiValue) {
        this.SupportsMultiValue = SupportsMultiValue;
    }

    @Element
    @Attribute(name = "SupportsStorage")
    public SupportsStorage SupportsStorage;

    public SupportsStorage getSupportsStorage() {
        return SupportsStorage;
    }

    public void setSupportsStorage(SupportsStorage SupportsStorage) {
        this.SupportsStorage = SupportsStorage;
    }

}
