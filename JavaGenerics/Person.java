public class Person <VariableType> {
    
    private String myName;
    private String myAge;
    private VariableType myDetails;

    public void setMyDetails(VariableType myDetails){
        this.myDetails=myDetails;
    }

    public VariableType getMyDetails(){
        return myDetails;
    }

    public void setMyName(String myName){
        this.myName=myName;
    }

    public String getMyName(){
        return myName;
    }

    public void setMyAge(String myAge){
        this.myAge=myAge;
    }

    public String getAge(){
        return myAge;
    }
}
