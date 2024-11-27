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
    Course apbio = new Course("AP Biology", "a college equivalent biology course", 4, {10,11,12});
    Course biomed = new Course("Principles of Biomedical Science", "a course investigating health conditions, lifestyle choices, and medicine", 1, {9,10,11,12});
    Course biomed2 = new Course("Honors Human Body Systems", "a more advanced class on body functions and medical mysteries", 2, {10,11,12});
    Course chem = new Course("Chemistry", "an introductory general chemistry course", 1, {9,10,11,12});
    Course apchem = new Course("AP Chemistry", "a college equivalent chemistry course", 4, {10,11,12});
    Course earthspace = new Course("Earth and Space", "an introductory course to earth and space science", 1, {9,10,11,12});
    Course phys = new Course("Physics", "an introductory course to literally the best science", 1, {9, 10,11,12});
    Course apphys = new Course("AP Physics", "college level course on mechanics, electricity, and magnetism", 4, {10,11,12}); 
    public static Course[] sci = {bio, apbio, biomed, biomed2, chem, apchem, earthspace, phys, apphys};
    Course glob = new Course("Global Studies", "a required course on global issues, culture, and current events", 1, {9});
    Course world = new Course("World History", "a course of how ideas, people, and knowledge spread around the world", 2, {10});
    Course apworld = new Course("AP World History", "a college level modern world history course", 4, {10);
    Course ushist = new Course("US History", "a course of the 20th century US history, emphasising the founding ideals", 2, {11});
    Course apush = new Course("AP US History", "an advance course that investigates siginificant events starting in the 1500s", 4, {11});
    Course civecon = new Course("Civics and Economics", "two one-semester courses teaching the federal government works and finance", 2, {12});
    Course aphgeo = new Course("AP Human Geography", "a advanced course teaching maps and data and interpreting phenomena", 3, {10, 11, 12});
    Course mindreading = new Course("AP Psychology", "a course to study psychological behavior and metal processes ", 3, {11, 12}); //it would be funny we can techincally call the variables whatever we want
    public static Course[] soc = {glob, world, apworld, ushist, apush, civecon, aphgeo, mindreading};
    Course art = new Course("Art", "a basic course on the history, prinicples, and vocabulary of art", 1, {9,10,11,12});
    Course cerams = new Course("Ceramics", "the fundamentals of hand built and thrown cermaics", 1, {9,10,11,12});
    Course choir = new Course("Choir", "a class for singers to learn vocal technique and basic music theory", 1, {9,10,11,12});
    Course wind = new Course("Wind Ensemble", "performace oreanted music class for students to learn and perform", 1, {9,10,11,12});
    Course drama = new Course("Drama", "a class on the basics on dramatic performing, theatre, and historical drama", 1, {9,10,11,12});
    Course drama2 = new Course("Advanced Drama", "a class for serious drama students with skills and additions in film study", 1, {11,12});
    Course band = new Course("Concert/Symphonic Band", "a beginner band class without auditions", 1, {9,10,11,12});
    Course apmusic = new Course("AP Music Theory", "an academic course with aural compnents teaching terminology, rhythm, and more", 1, {9,10,11,12});
    public static Course[] vapa = {art, cerams, choir, wind, drama, drama2, band, apmusic};
    Course asl = new Course("American Sign Language", "an introductiory class teaching ASL language and culture", 1, {9,10,11,12});
    Course span = new Course("Spanish", "an introductiory class teaching Spanish language and culture", 1, {9,10,11,12});
    Course jap = new Course("Japanese", "an introductiory class teaching Japanese language and culture", 2, {9,10,11,12});
    Course chn = new Course("Chinese", "an introductiory class teaching Chinese language and culture", 2, {9,10,11,12});
    Course kor = new Course("Korean", "an introductiory class teaching Korean language and culture", 1, {9,10,11,12});
    Course fre = new Course("French", "an introductiory class teaching French language and culture", 1, {9,10,11,12});
    Course apspan = new Course("AP Spanish", "an advanced class teaching Spanish culture and history", 3, {10,11,12});
    Course apjap = new Course("AP Japanese", "an advanced class teaching Japanese culture and history", 4, {10,11,12});
    Course apchn = new Course("AP Chinese", "an advanced class teaching Chinese culture and history", 4, {10,11,12});
    Course apfre = new Course("AP French", "an advanced class teaching French culture and history", 3, {10,11,12});
    public static Course[] lang = {asl, span, jap, chn, kor, fre, apspan, apjap, apchn, apfre};
    Course alg1 = new Course("Algebra I", "", 1, {9,10,11,12});
    Course geo = new Course("Geometry", "", 1, {9,10,11,12});
    Course alg2 = new Course("Algebra II", "", 1, {9,10,11,12});
    Course prec = new Course("Pre-Calculus", "", 2, {9,10,11,12});
    Course calc = new Course("Calculus", "", 2, {9,10,11,12});
    Course apcalcab = new Course("AP Calculus AB", "", 3, {9,10,11,12});
    Course apcalcbc = new Course("AP Calculus BC", "", 4, {9,10,11,12});
    Course apstats = new Course("AP Statistics", "", 3, {11,12});
    Course multivar = new Course("Multivariable Calculus", "", 4, {12});
    public static Course[] math = {alg1, geo, alg2, prec, calc, apcalcab, apcalcbc, apstats, multivar};

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
        int hard = -1;
        while (hard < 0 || hard > 10){
            System.out.print("On a scale of 1-10 difficult classes do you want? ");
            try {
                hard = scan.nextInt();
            } catch (Exception e){
                annoyed += 1;
                System.out.println(wrong[(int)(Math.random()/(1.0/5.0))]);
            }
        }
        String subject = "";
        while (subject != "math" && subject != "world language" && subject != "vapa" && subject != "science" && subject != "social studies"){
            System.out.print("On a scale of 1-10, how difficult a class do you want? ");
            hard = scan.next().toLowerCase();
            if (subject != "math" && subject != "world language" && subject != "vapa" && subject != "science" && subject != "social studies"){
                System.out.println(wrong[(int)(Math.random()/(1.0/5.0))]);
                System.out.println("Not an option. We only have math, world language, VAPA, science, and social studies. ")
            }
        }
        System.out.print("Do you want to take this class? ");
        String yn = scan.next().toLowerCase();
        if (yn.equals("y"){
            //courses.add(getName());
        }
        System.out.print("Is that it? (y/n) ");
        finish = scan.next().toLowerCase();
        if (finish.equals("y")){
            System.out.println("Hot diggity dog! We're done here!");
            System.out.print("The classes for you are: ");
            break;
            //more shennanigans//
        }
    }

    if (annoyed >= 3){
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
