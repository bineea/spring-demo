package my.demo.service;

public class TestService {

    public static void main(String[] args) {
        FirstService firstService = new FirstService();
        SecondService secondService = new SecondService();

        firstService.secondService = secondService;
        secondService.firstService = firstService;
    }
}
