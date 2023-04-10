public abstract class WirelessPhone extends AbstractPhone{ //абстрактный класс БеспроводнойТелефон, унаследованный от абстрактного
    //класса АбстрактныйТелефон
    private int hoursOfBattery; //обьляем приватное целочисленное поле часовДержитБатарея

    public WirelessPhone(int yearOfIssue, int hoursOfBattery) { //обязательная реализация конструктора класса с привзкой к родительскому классу
        super(yearOfIssue); //наследуемся от родительского конструктора
        this.hoursOfBattery = hoursOfBattery; //инициализируем поле класса
    }
}
