public class FirstClass {
    public static void main(String[] args){
        Vacancy vacancy = new Vacancy("Developer");
        User tester = new User(7,vacancy);
        System.out.println(tester.getId());
        System.out.println(tester.getVacancy());
    }
}
class User{
    private long id;
    private Vacancy vacancy;
    public User(long id, Vacancy vacancy) {
        this.id = id;
        this.vacancy = vacancy;
    }
    public long getId() {
        return id;
    }

    public String getVacancy() {
        return vacancy.getVacany();
    }
}

class Vacancy{
    private String title;
    public Vacancy(String vacance) {
        this.title = vacance;
    }
    String getVacany(){
        return title;
    }
} 
