public abstract class WirelessPhone extends AbstractPhone { // абстрактний клас БездротовийТелефон, успадкований від абстрактного класу АбстрактнийТелефон
    private int hoursOfBattery; // оголошуємо приватне ціле поле годинДіїБатареї

    public WirelessPhone(int yearOfIssue, int hoursOfBattery) { // обов'язкова реалізація конструктора класу з прив'язкою до батьківського класу
        super(yearOfIssue); // успадковуємо конструктор від батьківського класу
        this.hoursOfBattery = hoursOfBattery; // ініціалізуємо поле класу
    }
}
