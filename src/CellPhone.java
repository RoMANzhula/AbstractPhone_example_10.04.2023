public class CellPhone extends WirelessPhone { //публичный класс СотовыйТелефон, унаследованный от абстракного класса БеспроводнойТелефон

    public CellPhone(int yearOfIssue, int hoursOfBattery) { //обязательная реализация конструктора родительского абстракного класса
        super(yearOfIssue, hoursOfBattery);
    }


    ////обязательное переопределение абстрактных методов класса AbstractPone как родительского
    @Override
    public void callTo(int outputNumber) {
        System.out.println("I am calling number..." + outputNumber); //печатаем - я звоню по номеру
    }

    @Override
    public void callingUs(int inputNumber) {
        System.out.println("Ding-ding..."); //печатаем - дзынь-дзынь
    }
}
