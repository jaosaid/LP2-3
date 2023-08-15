Isabelly Barbosa Gonçalves
João Antonio Dias
Exercício 1:
public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    // Método para definir o email
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Author[name=" + name + ",email=" + email + ",gender=" + gender + "]";
    }

    public static void main(String[] args) {
        // Testar o construtor
        Author author = new Author("Isabelly Barbosa Goncalves", "isabellybarbosapdm@gmail.com", 'f');

        // Testar os getters
        System.out.println("Author name: " + author.getName());
        System.out.println("Author email: " + author.getEmail());
        System.out.println("Author gender: " + author.getGender());
        System.out.println("Author details: " + author.toString());

        // Testar o setter
        author.setEmail("wellington.tuler@example.com");
        System.out.println("Updated email: " + author.getEmail());

        // Verificar o método toString() novamente
        System.out.println("Author details after update: " + author.toString());
    }
}
public class Main {
    public static void main(String[] args) {
        Author author = new Author("Isabelly Barbosa Goncalves", "isabellybarbosapdm@gmail.com", 'f');

        System.out.println("Author name: " + author.getName());
        System.out.println("Author email: " + author.getEmail());
        System.out.println("Author gender: " + author.getGender());
        System.out.println("Author details: " + author.toString());

        // Não existe setter, portanto não é possível alterar name e gender
        // author.setName("Novo Nome"); // Isso geraria um erro de compilação
        // author.setGender('f'); // Isso também geraria um erro de compilação
    }
}
