package Pr_2;

public class _1_Author {

    private String email;
    private char gender;
    private String name;

    _1_Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public char getGender() {
        return gender;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}

//Это не нуженый коментарий
