public class Main {


    public static void main(String[] args) {

        Book warAndPeace = new Book ("Л. Н.Толстой", "Война и Мир", 1867);
        System.out.println("Автор - " + warAndPeace.authorName);
        System.out.println("Название - " + warAndPeace.bookName);
        System.out.println("Год - " + warAndPeace.publishingYear);

        Book starikIMore = new Book("Э. Хемингуэй", "Старик и море", 1952);
        System.out.println("Автор - " + starikIMore.authorName);
        System.out.println("Название - " + starikIMore.bookName);
        System.out.println("Год - " + starikIMore.publishingYear);

        System.out.println();

        Person sarah = new Person("Sarah", 30);
        System.out.println("sarah.name = " + sarah.name);
        System.out.println("sarah.age = " + sarah.age);
        Person john = new Person("John", 13);
        System.out.println("john.name = " + john.name);
        System.out.println("john.age = " + john.age);
    }
}