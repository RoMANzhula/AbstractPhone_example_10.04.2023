public class Main {
    public static void main(String[] args) {
        AbstractPhone firstPhone = new ThomasEdisonPhone(1879); //создаем обьект типа класса AbstractPhone, но с поведением
        //класса ThomasEdisonPhone, которому устанавливаем в качестве аргумента(год выпуска телефона) значение
        AbstractPhone landlinePhone = new LandlinePhone(1984); //создаем обьект типа класса AbstractPhone, но с поведением
        //класса LandlinePhone, которому устанавливаем в качестве аргумента(год выпуска телефона) значение
        AbstractPhone videoPhone = new VideoPhone(2018); //создаем обьект типа класса AbstractPhone, но с поведением
        //класса VideoPhone, которому устанавливаем в качестве аргумента(год выпуска телефона) значение
        User user = new User("Subscriber"); //создаем нового пользователя и в качестве аргумента задаем имя - Абонент

        user.callAnotherUser(111222333, firstPhone); //для пользователя вызываем метод - позвонить другому пользователю и
        //в качестве аргументов в конструктор подставляем номер телефона и каким телфоном будем осуществлять звонок

        user.callAnotherUser(111222333, landlinePhone); //для пользователя вызываем метод - позвонить другому пользователю и
        //в качестве аргументов в конструктор подставляем номер телефона и каким телфоном будем осуществлять звонок

        user.callAnotherUser(111222333, videoPhone); //для пользователя вызываем метод - позвонить другому пользователю и
        //в качестве аргументов в конструктор подставляем номер телефона и каким телфоном будем осуществлять звонок
    }
}