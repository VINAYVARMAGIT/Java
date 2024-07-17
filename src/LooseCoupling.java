interface PhoneComponents{

    void open();
    void close();
}

class Coc implements PhoneComponents{

    public void open(){
        System.out.println("Clash of clans Opened");
    }
    public void close (){
        System.out.println("Clash of clans closed");
    }
}
class MusicPLayer implements PhoneComponents{

    @Override
    public void open() {
       System.out.println("Music PLayer is opened");
    }

    @Override
    public void close() {
        System.out.println("Music Player is closed.");
    }

}

class Phone {
    private PhoneComponents phonecomponents;

    public Phone(PhoneComponents phonecomponents) {
        this.phonecomponents = phonecomponents;
    }

    void run(){
        phonecomponents.open();
        phonecomponents.close();
    }
}

class Test10{
    public static void main(String[] args) {
        Phone p = new Phone(new Coc());
        p.run();
    }
}