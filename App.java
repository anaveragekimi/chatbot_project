import java.util.*;
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
    Course apbio = new Course("AP Biology", "PLACEHOLDER", 4, {10,11,12});
    Course biomed = new Course("Principles of Biomedical Science", "PLACEHOLDER", 1, {9,10,11,12});
    Course biomed2 = new Course("Honors Human Body Systems", "PLACEHOLDER", 2, {10,11,12});
    Course chem = new Course("Chemistry", "an introductory general chemistry course", 1, {9,10,11,12});
    Course apchem = new Course("AP Chemistry", "PLACEHOLDER", 4, {10,11,12});
    Course earthspace = new Course("Earth and Space", "an introductory course to earth and space science", 1, {9,10,11,12});
    Course phys = new Course("Physics", "an introductory course to literally the best science", 1, {9, 10,11,12});
    Course apphys = new Course("AP Physics", "PLACEHOLDER", 4, {10,11,12}); 
    public static Course[] sci = {bio, apbio, biomed, biomed2, chem, apchem, earthspace, phys, apphys};
    Course glob = new Course("Global Studies", "a required course on global issues, culture, and current events", 1, {9});
    Course world = new Course("World History", "PLACEHOLDER", 2, {10});
    Course apworld = new Course("AP World History", "PLACEHOLDER", 4, {10);
    Course ushist = new Course("US History", "PLACEHOLDER", 2, {11});
    Course apush = new Course("AP US History", "PLACEHOLDER", 4, {11});
    Course civecon = new Course("Civics and Economics", "PLACEHOLDER", 2, {12});
    Course aphgeo = new Course("AP Human Geography", "PLACEHOLDER", 3, {10, 11, 12});
    Course mindreading = new Course("AP Psychology", "PLACEHOLDER", 3, {11, 12}); //it would be funny we can techincally call the variables whatever we want
    public static Course[] soc = {glob, world, apworld, ushist, apush, civecon, aphgeo, mindreading};
    Course art = new Course("Art", "PLACEHOLDER", 1, {9,10,11,12});
    Course cerams = new Course("Ceramics", "PLACEHOLDER", 1, {9,10,11,12});
    Course choir = new Course("Choir", "PLACEHOLDER", 1, {9,10,11,12});
    Course wind = new Course("Wind Ensemble", "PLACEHOLDER", 1, {9,10,11,12});
    Course drama = new Course("Drama", "PLACEHOLDER", 1, {9,10,11,12});
    Course drama2 = new Course("Advanced Drama", "PLACEHOLDER", 1, {9,10,11,12});
    Course band = new Course("Concert/Symphonic Band", "PLACEHOLDER", 1, {9,10,11,12});
    Course apmusic = new Course("AP Music Theory", "PLACEHOLDER", 1, {9,10,11,12});
    public static Course[] vapa = {art, cerams, choir, wind, drama, drama2, band, apmusic};
    Course asl = new Course("American Sign Language", "PLACEHOLDER", 1, {9,10,11,12});
    Course span = new Course("Spanish", "PLACEHOLDER", 1, {9,10,11,12});
    Course jap = new Course("Japanese", "PLACEHOLDER", 2, {9,10,11,12});
    Course chn = new Course("Chinese", "PLACEHOLDER", 2, {9,10,11,12});
    Course kor = new Course("Korean", "PLACEHOLDER", 1, {9,10,11,12});
    Course fre = new Course("French", "PLACEHOLDER", 1, {9,10,11,12});
    Course apspan = new Course("AP Spanish", "PLACEHOLDER", 3, {9,10,11,12});
    Course apjap = new Course("AP Japanese", "PLACEHOLDER", 4, {9,10,11,12});
    Course apchn = new Course("AP Chinese", "PLACEHOLDER", 4, {9,10,11,12});
    Course apfre = new Course("AP French", "PLACEHOLDER", 3, {9,10,11,12});
    public static Course[] lang = {asl, span, jap, chn, kor, fre, apspan, apjap, apchn, apfre};
    
}
public class Main(String args[]){
    System.out.println("Hi, I'm Bob, and I'm here to help you choose some courses for your next year!");
    System.out.print("So, what grade are you going into? ");
    int gradelevel = 57123856323; //i chose a really random number that someone would be unlikely to enter if they were messing around
    int annoyed = 0;
    String[] wrong = {"Ok, stop screwing around. ", "Do you even want help? ", "Last chance to do this right, or I'm not helping you anymore. ", "Stop. Not funny. I'm trying to help you so please cooperate: ", "Just do it right. It cannot be simpler. "};
    String[] numbered = {"", "first", "second", "third", "fourth", "fifth", "sixth"};
    ArrayList<String> courses  new ArrayList<String>();
    boolean end = false;
    String finish = "";
    while (gradelevel != 57123856323){
        System.out.print("What grade are you in? ");
        try {
            gradelevel = scan.nextInt();
        } catch (Exception e){
            annoyed += 1;
            System.out.println(wrong[(int)(Math.random()/(1.0/5.0))]);
        }
    while (gradelevel > 12 || gradelevel < 9){
        System.out.print("What grade are you in? ");
        try {
            gradelevel = scan.nextInt();
        } catch (Exception e){
            annoyed += 1;
            System.out.println(wrong[(int)(Math.random()/(1.0/5.0))]);
        }
    }
    while (true){
        //shenannigans//
        //courses.add(thingy);//
        System.out.print("Is that it? (y/n) ");
        finish = scan.next().toLowerCase();
        if (finish.equals("y")){
            System.out.println("Hot diggity dog! We're done here!");
            System.out.print("The classes for you are: ");
            //more shennanigans//
        }
    }
/*
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
*/
}
