// Exercise 11: Dependency Injection
interface Service {
    void serve();
}

class EmailService implements Service {
    public void serve() {
        System.out.println("Email Service Called");
    }
}

class Client {
    private Service service;
    public Client(Service service) {
        this.service = service;
    }
    public void doSomething() {
        service.serve();
    }
}

class DIExample {
    public static void main(String[] args) {
        Service emailService = new EmailService();
        Client client = new Client(emailService);
        client.doSomething();
    }
}
