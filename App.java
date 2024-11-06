public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

public class Course {
    private String name;
    private String category;
    private int difficulty;
    private int grade;
    private String description;

    public String getName() {
        return this.name;
    }
    public String getCat() {
        return this.category;
    }
    public String getDiff() {
        return this.difficulty;
    }
    public String getGrade() {
        return this.grade;
    }
    public String getdesc() {
        return this.description;
    }
    Course(String n, String c, String d, int de, int g) {
        this.name = n;
        this.category = c;
        this.description = d; 
        this.difficulty = de;
        this.grade = g;
    }
}