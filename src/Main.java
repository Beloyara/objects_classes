public class Main {
    public static void main(String[] args) {

        Person sarah = new Person("Sarah", 30);
        System.out.println("sarah.name = " + sarah.getName());
        System.out.println("sarah.age = " + sarah.getAge());
        sarah.setAge(31);
        System.out.println("sarah.getAge() = " + sarah.getAge());

        Person john = new Person("John", 13);
        System.out.println("john.name = " + john.getName());
        System.out.println("john.age = " + john.getAge());

        System.out.println();

        Author warAndPeace = new Author ("Л.Н.Толстой");
        System.out.println("Автор - " + warAndPeace.getAuthorName());
        Book warAndPeace1 = new Book ("Война и Мир", 1867);
        System.out.println("Название - " + warAndPeace1.getBookName());
        System.out.println("Год - " + warAndPeace1.getPublishingYear());

        Author starikIMore = new Author("Э.Хемингуэй");
        Book starikIMore1 = new Book("Старик и море", 1952);
        System.out.println("Автор - " + starikIMore.getAuthorName());
        System.out.println("Название - " + starikIMore1.getBookName());
        System.out.println("Год - " + starikIMore1.getPublishingYear());
    }
}