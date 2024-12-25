public class User { // публічний клас Користувач
    private String name; // приватне поле - ім'я

    public User(String name) { // конструктор класу
        this.name = name; // ініціалізація поля класу
    }

    public void callAnotherUser(int number, AbstractPhone abstractPhone) { 
        // ось явний приклад використання ПОЛІМОРФІЗМУ - AbstractPhone abstractPhone
        abstractPhone.callTo(number); 
        // об'єкт і метод класу AbstractPhone - здійснюємо дзвінок за номером
    }
}
