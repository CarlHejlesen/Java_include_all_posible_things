package package_2;

public class Validation_class {

    public boolean validates_email(String testString) {

        // Method to test
        // * Must contain "@" and "." Be at least 2 letters long, and max 50 letters
        // long*/
        if(testString==null){
            return false;
        }
        if(!(testString instanceof String)){
            return false;
        }

        if(!(testString.length()>1) && !(testString.length()<50)){
            return false;
        }

        if(!(testString.contains("@"))){
            return false;
        }
        if(!(testString.contains("."))){
            return false;
        }
        return true;
    }





    public boolean validates_telefone_number(){
        return true;
    }
}
