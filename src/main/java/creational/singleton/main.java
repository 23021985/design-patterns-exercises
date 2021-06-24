package creational.singleton;

public class main {
    private static SecretService SingletonService;

    public static <SingletonService> void main(String... args) {
         SingletonService service1 = (SingletonService) SingletonService.getInstance();
         SingletonService service2 = (SingletonService) SingletonService.getInstance();
         SingletonService service3 = (SingletonService) SingletonService.getInstance();
//
         ((SecretService) service1).setSecret("abc");
//
         System.out.println(((SecretService) service1).getSecret());
         System.out.println(((SecretService) service2).getSecret());
         System.out.println(((SecretService) service3).getSecret());
    }
}
