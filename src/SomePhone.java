public class SomePhone { //публичный класс Какой-тоТелефон
    private int yearIssue; //приватное поле годВыпуска
    private String company; //приватное поле компания

    public SomePhone(int yearIssue, String company) { //конструктор класса
        this.yearIssue = yearIssue; //инициализация полей
        this.company = company;
    }

    private void openConnection(){} //метод (пустой) открытьСоединение

    public void callTo() { //публичный метод звонитьКому-то
        openConnection(); //вызываем метод открытьСоединение
        System.out.println("I am calling number..."); //печатаем - я звоню по номеру
    }

    public void callingUs() { //публичный метод звонятНам()
        System.out.println("Ding-ding..."); //печатаем - дзынь-дзынь
    }
}
