public class CellPhone extends WirelessPhone { // публічний клас МобільнийТелефон, успадкований від абстрактного класу БездротовийТелефон

    public CellPhone(int yearOfIssue, int hoursOfBattery) { // обов’язкова реалізація конструктора батьківського абстрактного класу
        super(yearOfIssue, hoursOfBattery);
    }

    // обов’язкове перевизначення абстрактних методів класу AbstractPhone як батьківського
    @Override
    public void callTo(int outputNumber) {
        System.out.println("Я телефоную на номер..." + outputNumber); // друкуємо - я телефоную на номер
    }

    @Override
    public void callingUs(int inputNumber) {
        System.out.println("Дзинь-дзинь..."); // друкуємо - дзинь-дзинь
    }
}
