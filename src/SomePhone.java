public class SomePhone { // публічний клас ЯкийсьТелефон
    private int yearIssue; // приватне поле рікВипуску
    private String company; // приватне поле компанія

    public SomePhone(int yearIssue, String company) { // конструктор класу
        this.yearIssue = yearIssue; // ініціалізація полів
        this.company = company;
    }

    private void openConnection() {} // метод (порожній) відкритиЗ'єднання

    public void callTo() { // публічний метод дзвонитиКому-небудь
        openConnection(); // викликаємо метод відкритиЗ'єднання
        System.out.println("Я дзвоню за номером..."); // друкуємо - я дзвоню за номером
    }

    public void callingUs() { // публічний метод дзвонятьНам()
        System.out.println("Дзинь-дзинь..."); // друкуємо - дзинь-дзинь
    }
}
