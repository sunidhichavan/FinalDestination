//program for default constructor
class ABC {
    private String name;

    // constructor
    ABC()
    {
        System.out.println("Constructor Called:");
        name = "Sunidhi";
    }

    public static void main(String[] args)
    {
        // constructor is invoked while
        // creating an object of the Main class
        ABC obj = new ABC();
        System.out.println("The name is " + obj.name);
    }
}
