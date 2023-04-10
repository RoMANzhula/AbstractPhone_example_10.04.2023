public abstract class AbstractPhone { //публичный абстрактный кдасс
    private int yearOfIssue; //обьявляем приватное поле - год выпуска телефона

    public AbstractPhone(int yearOfIssue) { //обьявляем конструктор класса
        this.yearOfIssue = yearOfIssue; //инициализируем поле
    }

    public abstract void callTo(int outputNumber); //обьявляем абстрактный класс без реализации - позвонитьКому-то (на вход
    //принимает целочисленную переменную исходящийНомер)

    public abstract void callingUs(int inputNumber); //обьявляем абстрактный класс без реализации - звонятНам (на вход
    //принимает целочисленную переменную входяшийНомер)
}
