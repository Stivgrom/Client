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
public class SupportsAttachment extends Serializer<SupportsAttachment>{
    
    public SupportsAttachment(Class<SupportsAttachment> typeParameterClass) {
        super(typeParameterClass);
    }    

    @Attribute
    public String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Text
    public String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
