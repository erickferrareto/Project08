public class Names {
    public static void main(String[] args) {
        Contacts[] users = new Contacts[4];

        Contacts contato1 = new Contacts();
        contato1.setName("Erick");

        Contacts contato2 = new Contacts();
        contato2.setName("Tayna");

        Contacts contato3 = new Contacts();
        contato3.setName("Pedro");

        Contacts contato4 = new Contacts();
        contato4.setName("Alessandra");

        users[0] = contato1;
        users[1] = contato2;
        users[2] = contato3;
        users[3] = contato4;

        System.out.println(users[0].getName());
        System.out.println(users[1].getName());
        System.out.println(users[2].getName());
        System.out.println(users[3].getName());

    }
}
