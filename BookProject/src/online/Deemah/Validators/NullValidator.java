
package online.Deemah.Validators;

public class NullValidator implements Validator {
    
    
    private String field ;
    private Object obj ; 

    public NullValidator(String field, Object obj) {
        this.field = field;
        this.obj = obj;
    }
    
    
    
    @Override
    public void validate() {

        if(obj == null ){
       
            throw new IllegalArgumentException(field+" can’t be null ");
            
        }
        
        
    }
    
}

    
    

