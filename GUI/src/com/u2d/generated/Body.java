/*
 * Body.java
 *
 * This code has been auto-updated by JTS after it has been auto-generated by umlc
 * Created on Wed Oct 05 10:31:03 EDT 2011
 */

package com.u2d.generated;


import com.u2d.model.*;
import com.u2d.app.PersistenceMechanism;
import com.u2d.type.*;
import com.u2d.type.atom.*;
import com.u2d.type.composite.*;
import com.u2d.list.RelationalList;
import com.u2d.reflection.Fld;
import javax.persistence.Entity;
/** place holder for more imports **/


@Entity
public  class Body extends AbstractComplexEObject_JTS{

    
    /** Creates a new instance of Body */
    public Body() {
    }
    public Title title() { 
        StringBuffer text = new StringBuffer();
        text.append(name.title() + " [Body]");
        return new Title(text.toString());
    }    
    


    // ******    name   ******
    private final StringEO name = new StringEO();
    public StringEO getName() { return name;}

    // ******    interpretation   ******
    private final StringEO interpretation = new StringEO();
    public StringEO getInterpretation() { return interpretation;}

   


 
    // ********  complexField ********
    private ComplexField complexField;
    public ComplexField getComplexField() {
        return complexField;
    }
    public void setComplexField(ComplexField complexField) {
        ComplexField old = this.complexField;
        this.complexField = complexField;
        firePropertyChange("complexField", old, this.complexField );
    }




 
/************** Uncomment the following as needed *****************************/
      public static String[] fieldOrder  = {"name", "interpretation", "complexField", "referencingMessageDefs", "referencingEventDefs"};
//    public static String[] fieldOrder        = {"fieldname1", "fieldname2"};

      ;
//    public static String[] tabViews          = {"fieldname1", "fieldname2"};

      ;
//    public static String[] flattenIntoParent = {"fieldname1", "fieldname2"};

      ;
//    public static String[] identities = {"fieldname1", "fieldname2"};

//    public static String pluralName() { return "Bodys"; }
      /* Specify a color to represnt this class */
//    public static Color colorCode = new Color(0x2332);

      /* Use a different Icon for each instance. Change photoFieldName. */
//    private transient PhotoIconAssistant assistant = 
//                        new PhotoIconAssistant(this, photoFieldname);
//    public Icon iconLg() { return assistant.iconLg(); }
//    public Icon iconSm() { return assistant.iconSm(); }


      /* Specify the default search field for this class */
//    public static String defaultSearchPath = "";


      /* Specify a custom view for this class. 
//    public EView getMainView()
//    {
//       return new CustomBodyView(this);
//    }
/**********************/
/**@Cmd place holder**/        
}