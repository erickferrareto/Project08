public class Names {
    public static void main(String[] args) {
        Contacts[] users = new Contacts[4];

        Contacts contato1 = new Contacts();
        contato1.setName("Erick");

        Contacts contato2 = new Contacts();
        contato2.setName("Tayna");

        Contacts contato3 = new Contacts();
        contato3.setName("Pedro");

        users[0] = contato1;
        users[1] = contato2;
        users[2] = contato3;

        System.out.println(users[0].getName());
        System.out.println(users[1].getName());
        System.out.println(users[2].getName());

    }
}
