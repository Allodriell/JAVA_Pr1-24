package Pr_19;

public class WrongNameException extends RuntimeException{
    public WrongNameException(String ErrorMessage){
        super(ErrorMessage);
    }
}
