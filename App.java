public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

public class Course {
    private String name;
    private int difficulty;
    private int[] grade;
    private String description;

    public String getName() {
        return this.name;
    }
    public String getDiff() {
        return this.difficulty;
        // scale of 1-4: 1 - easy regular, 2 - hard regular, 3 - easy ap, 4 - hard ap
    }
    public String getGrade() {
        return this.grade;
    }
    public String getdesc() {
        return this.description;
    }
    Course(String name, String desc, int diff, int[] grades) {
        this.name = name;
        this.description = desc; 
        this.difficulty = diff;
        this.grade = grades;
    }
    public boolean meetsReq(int d, int g){
        boolean req = false;
        for (int i : this.grade) if (g == i) req = true;
        return req && this.difficulty < d;
    }
 }

public class courseCat() {
    Course bio = new Course("Biology", "an introductory general biology course", 1, {9,10,11,12});
    Course biomed = new Course("Principles of Biomedical Science", "PLACEHOLDER", 1, {9,10,11,12});
    Course biomed2 = new Course("Honors Human Body Systems", "PLACEHOLDER", 1, {10,11,12});
    public static Course[] sci = {bio, biomed, biomed2};
}