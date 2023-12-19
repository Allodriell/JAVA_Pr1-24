package Pr_2;

public class _1_TestAuthor {
    public static void main(String[] args){
        _1_Author user1 = new _1_Author("Stephen", "king@mirea.ru", 'M');

        System.out.println("Имя автора: " + user1.getName());
        System.out.println("Email: " + user1.getEmail());
        System.out.println("Пол автора: " + user1.getGender());

        user1.setEmail("TheKingOfHorrors@mirea.ru");
        System.out.print("Изменённая почта: " + user1.getEmail());



    }
}