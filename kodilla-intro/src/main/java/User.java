public class User {
    String name;
    int age;


    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Tom",18),
                new User("Chris", 60),
                new User("Luke", 70),
                new User("Kate", 25)};
        for (int i = 0; i<users.length; i++);
        double age = 0;
        for (User user : users ){
            age = age + user.age;
        }
        double middleAge = age/users.length;
        for (User user : users){
            if (user.age < middleAge );
            System.out.println(user.name);
        }



    }

}
