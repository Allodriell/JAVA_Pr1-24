package Pr_19;

public class invalidINN extends RuntimeException{
    public invalidINN(String ErrorMessage){
        super(ErrorMessage);
    }
}
