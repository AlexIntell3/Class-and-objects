public class App {
    public static void main(String... args) {

        Author pushkin = new Author("Александр", "Пушкин");
        Author tolstoy = new Author("Лев", "Толстой");

        Book ruslanAndLudmila = new Book("Руслан и Людмила", pushkin,1826);
        Book warAndPeace = new Book("Война и Мир",tolstoy,1869);

        System.out.println(ruslanAndLudmila.getTitle()+", "+ ruslanAndLudmila.getAuthorFullName()+","+ruslanAndLudmila.getYear()+".");

        System.out.println(warAndPeace.getTitle()+", "+warAndPeace.getAuthorFullName()+","+warAndPeace.getYear()+".");}

        }

