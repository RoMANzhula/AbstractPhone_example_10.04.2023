public class User { //публичный класс Пользователь
    private String name; //приватное поле - имя

    public User(String name) { //конструктор класса
        this.name = name; //инициализаци поля класса
    }

    public void callAnotherUser(int number, AbstractPhone abstractPhone) { //вот явный пример использования ПОЛИМОРФИЗМА - AbstractPhone abstractPhone
        abstractPhone.callTo(number); //обьект и метод класса AbstractPhone - выполняем звонок с номера
    }
}
