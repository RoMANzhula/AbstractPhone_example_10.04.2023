public class LandlinePhone extends AbstractPhone { // публічний клас "Стаціонарний телефон", успадкований від батьківського класу AbstractPhone

    // обов'язкова реалізація батьківського конструктора
    public LandlinePhone(int yearOfIssue) {
        super(yearOfIssue);
    }

    @Override
    public void callTo(int outputNumber) {
        System.out.println("Я телефоную на номер..."); // друкуємо - я телефоную на номер
    }

    @Override
    public void callingUs(int inputNumber) {
        System.out.println("Дзинь-дзинь..."); // друкуємо - дзинь-дзинь
    }
}
