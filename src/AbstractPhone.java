public abstract class AbstractPhone { // публічний абстрактний клас
    private int yearOfIssue; // оголошуємо приватне поле - рік випуску телефону

    public AbstractPhone(int yearOfIssue) { // оголошуємо конструктор класу
        this.yearOfIssue = yearOfIssue; // ініціалізуємо поле
    }

    public abstract void callTo(int outputNumber); // оголошуємо абстрактний метод без реалізації - зателефонуватиКомусь 
    // (приймає на вхід ціле число outputNumber)

    public abstract void callingUs(int inputNumber); // оголошуємо абстрактний метод без реалізації - телефонуютьНам 
    // (приймає на вхід ціле число inputNumber)
}
