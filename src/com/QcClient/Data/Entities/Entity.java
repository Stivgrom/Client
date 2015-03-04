
package com.QcClient.Data.Entities;
import com.QcClient.Tools.Serializer;
import org.simpleframework.xml.*;
/**
 *
 * @author kostenko
 */
@Root
@Namespace(reference="")
@Attribute(required = true, empty = "")
public class Entity extends Serializer<Entity>{
    
    public Entity(Class<Entity> typeParameterClass) {
        super(typeParameterClass);
    }
    
    @Attribute(name = "Field", empty = "", required = true)
    public EntitiesEntityField[] Fields;

    public EntitiesEntityField[] getFields() {
        return Fields;
    }

    public void setFields(EntitiesEntityField[] Fields) {
        this.Fields = Fields;
    }

    @Element
    public String Type;

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }
    
}
