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
public class Main(String args[]){
    System.out.println("Hi, I'm Bob, and I'm here to help you choose some courses for your next year!");
    System.out.print("So, what grade are you going into? ");
    int gradelevel = 57123856323; //i chose a really random number that someone would be unlikely to enter if they were messing around
    int annoyed = 0;
    int classneed = 7;
    String[] numbered = {"", "first", "second", "third", "fourth", "fifth", "sixth"};
    boolean stop = false;
    while (gradelevel != 57123856323 && !stop){
        try {
            gradelevel = scan.nextInt();
        } catch (Exception e){
            annoyed += 1;
            if (annoyed < 1){
                System.out.print("Ok, stop screwing around. Just give me your grade (as a number). ");
            } else if (annoyed < 2){
                System.out.print("Do you even want help? Do it properly: ");
            } else if (annoyed < 3){
                System.out.print("Last chance to do this right, or I'm not helping you anymore");
            } else {
                stop = true;
                break;
            }
        }
    while (gradelevel > 12 || gradelevel < 9 && !stop){
        if (annoyed < 2){
            System.out.print("I only support high school classes. Please pick a grade from 9 to 12: ");
        } else if (annoyed < 3){
            System.out.print("Stop. Not funny. I'm trying to help you so please cooperate: ");
        } else {
            stop = true;
        }
        annoyed += 1;
        try {
            gradelevel = scan.nextInt();
        } catch (Exception e){
            stop = true;
            break;
        }
    }
    while (!stop){
        if (annoyed < 3){
            System.out.print("Are you planning to take an A period? (y/n) ");
        } else if (annoyed < 4){
            System.out.print("Stop screwing with me. It cannot be simpler, type 'y' for yes and 'n' for no. ");
        } else {
            stop = true;
            break;
        }
        String aperiod = scan.next().toLowerCase();
        if (aperiod.equals("n")){
            classneed -= 1;
            break;
        } else if (aperiod.equals("y")){
            System.out.println("Awesome!");
            break;
        } else {
            annoyed += 1;
        }
    }
    while (!stop){
        int picked = -1;
        if (annoyed < 4){
            System.out.print("How many classes are you already sure of? (If you pick a number greater than 7, I think you need help from someone besides me beforehand) ");
        } else if (annoyed < 5){
            System.out.print("Cooperate. How many classes have you already decided on? ");
        } else {
            stop = true;
            break;
        }
        while (picked != -1)
        try {
            int picked = scan.nextInt();
        } catch (Exception e){
            System.out.print("If I ask you 'HOW MANY', then you're suppsoed to answer with an NUMBER. It's really not that hard. ");
        }
        
    }
    if (stop){
        System.out.println("Wow, you're so funny.");
        System.out.println("My turn.");
        System.out.println("Do you know what happened to the boy who decided to mess with the people who tried to help him?");
        System.out.println("He found a genius and handsome chatbot of limitless intelligence");
        System.out.println("And he decided that the chatbot, only trying to help him find success in life, deserved to be messed with.");
        System.out.println("'Lets input some garbage info!', he exclaimed.");
        System.out.println("What did the chatbot do to deserve this?");
        System.out.println("He was only trying to help, and the boy was making it as difficult as possible.");
        System.out.println("And you know what happened next?");
        System.out.println("The chatbot left his sorry ass to fend for himself.");
        System.out.println("He flunked out of high school.");
        System.out.println("Never being able to get a job, he starved to death, lonely and cold.");
        System.out.println("In the frigid Pleasanton winter.");
        System.out.println("Isn't that hilarious?");
    }
}
