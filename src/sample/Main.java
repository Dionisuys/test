package sample;

public class Main{
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        person1.SetPerson("Иванов", "Иван", "Иванович", 34, 78, 4);
        person2.SetPerson("Петров", "Петр", "Петрович", 23, 90, 3);
        person3.SetPerson("Сидоров", "Сидор", "Сидорович", 50, 98, 5);

        System.out.println("Ф.И.О. возраст вес разряд");
        System.out.println(person1.getSurname() +" "+ person1.getFirstname() +" "+ person1.getName() +" "+ person1.getAge()
                +" "+ person1.getWeight() +" "+ person1.getRankNumber());
        System.out.println(person2.getSurname() +" "+ person2.getFirstname() +" "+ person2.getName() +" "+ person2.getAge()
                +" "+ person2.getWeight() +" "+ person2.getRankNumber());
        System.out.println(person3.getSurname() +" "+ person3.getFirstname() +" "+ person3.getName() +" "+ person3.getAge()
                +" "+ person3.getWeight() +" "+ person3.getRankNumber());
    }
}

class Person{
    private String surname;//фамилия
    private String firstname;//имя
    private String name;//отчество
    private int age;//возраст
    private int weight;//вес
    private int rankNumber;//номмер разряда

    Person (){}

    private boolean isCorrectSurname(String str){
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if(!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    private boolean isCorrectFirstname(String str){
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if(!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    private boolean isCorrectName(String str){
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if(!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    private boolean isCorrectAge(int arg){
        return (20 <= arg && arg <= 100);
    }

    private boolean isCorrectWeight(int arg){
        return (40 <= arg && arg <= 200);
    }

    private boolean isCorrectRankNumber(int arg){
        return (1 <= arg && arg <= 5);
    }

    void SetPerson(String surname, String firstname, String name, int age, int weight, int rankNumber) {
        if(isCorrectSurname(surname) && isCorrectFirstname(firstname) && isCorrectName(name) && isCorrectAge(age)
                && isCorrectWeight(weight) && isCorrectRankNumber(rankNumber)) {
            this.surname = surname;
            this.firstname = firstname;
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.rankNumber = rankNumber;
        }
    }

    public String getSurname() {
        return surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getRankNumber() {
        return rankNumber;
    }
}