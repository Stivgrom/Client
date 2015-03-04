/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QcClient.Tools;
import java.io.File;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.simpleframework.xml.*;
import org.simpleframework.xml.core.Persister;

/**
 *
 * @author kostenko
 */
public class Serializer<T> {
    final Class<T> typeParameterClass;
    
    public Serializer(Class<T> typeParameterClass) {
        this.typeParameterClass = typeParameterClass;
    }
    
    public String Serialize()
    {       
        org.simpleframework.xml.Serializer serialPers = new Persister();
        StringWriter stringWriter = new StringWriter();
        try {
            File file = new File("people.xml");
            serialPers.write(this, file);
            serialPers.write(this, stringWriter);
        } catch (Exception ex) {
            System.out.println("Got an Exception: " + ex.getMessage());            
        }
        return stringWriter.toString();
    }
     
    public T Deserialize(String inputXml)
    {
        StringReader strReader = new StringReader(inputXml);
        org.simpleframework.xml.Serializer serialPers = new Persister();
        try{
            return (T)serialPers.read(typeParameterClass, strReader);            
        } catch(Exception ex){
            System.out.println("Got an Exception: " + ex.getMessage());
        }
        return (T)serialPers;
    }     

}
