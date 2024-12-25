public class ThomasEdisonPhone extends AbstractPhone { // публічний клас ТелефонТомаЕдісона, успадкований від абстрактного класу АбстрактнийТелефон

    // реалізація обов'язкового конструктора класу за успадкованим класом
    public ThomasEdisonPhone(int yearOfIssue) {
        super(yearOfIssue);
    }

    // обов'язкова реалізація-перевизначення методів батьківського класу AbstractPhone
    @Override
    public void callTo(int outputNumber) {
        System.out.println("Вращайте ручку");
        System.out.println("Сообщите номер абонента, сэр");
    }

    @Override
    public void callingUs(int inputNumber) {
        System.out.println("Ding-ding...");
    }
}
