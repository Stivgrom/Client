/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QcClient.Data;
import com.QcClient.Tools.Serializer;
import org.simpleframework.xml.*;

/**
 *
 * @author kostenko
 */
@Namespace(reference="")
@Attribute
public class Domains extends Serializer<Domains>{   

    public Domains(Class<Domains> typeParameterClass) {
        super(typeParameterClass);
    }

    
}
