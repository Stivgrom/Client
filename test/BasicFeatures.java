/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.QcClient.Data.Domains;
import com.QcClient.Data.Entities.Entity;
import com.QcClient.Tools.Serializer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kostenko
 */
public class BasicFeatures {
    
    public BasicFeatures() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    
    @Test
    public void CreateSerial(){
                
        Entity newEntity = new Entity(Entity.class);
        newEntity.Type = "argggg";
        Object ob = newEntity.Serialize();  
        System.out.println("Got an Exception: " + ob);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
