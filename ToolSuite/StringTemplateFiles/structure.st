//package fr.inria.arles.pankesh.gen;

package $struct.packageName$;

import java.io.Serializable;

public class $struct.name$ implements Serializable {    
	private static final long serialVersionUID = 1L;
    $struct.allStructFields:{field |
	private $field.type$ $field.name; format="avoidCapital"$;  
	public $field.type$ get$field.name; format="capital"$() {
        return $field.name; format="avoidCapital"$;
    }    
 			
}$
   $if(struct.fields)$  
	public $struct.name$ ($struct.fields:{field | $field.type$ $field.name; format="avoidCapital"$}; separator=", "$) 
	{ 
	$struct.fields:{field | 
	this.$field.name; format="avoidCapital"$ = $field.name; format="avoidCapital"$;}$
    }
$endif$

}

