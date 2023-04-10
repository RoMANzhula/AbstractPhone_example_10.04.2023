public class LandlinePhone extends AbstractPhone { //публичный класс ПроводнойТелефон, унаследованный от родительского класса AbstractPhone

    //обязательная реализация родительского конструктора
    public LandlinePhone(int yearOfIssue) {
        super(yearOfIssue);
    }

    @Override
    public void callTo(int outputNumber) {
        System.out.println("I am calling number..."); //печатаем - я звоню по номеру
    }

    @Override
    public void callingUs(int inputNumber) {
        System.out.println("Ding-ding..."); //печатаем - дзынь-дзынь
    }
}
