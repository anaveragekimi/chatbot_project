import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hi, I'm Bob, and I'm here to help you choose some courses for your next year!");
        System.out.print("So, what grade are you going into? ");
        int gradelevel = 571238563; //i chose a really random number that someone would be unlikely to enter if they were messing around
        int annoyed = 0;
        courseCat c = new courseCat();
        String[] wrong = {"Ok, stop screwing around. ", "Do you even want help? ", "Last chance to do this right, or I'm not helping you anymore. ", "Stop. Not funny. I'm trying to help you so please cooperate: ", "Just do it right. It cannot be simpler. "};
        ArrayList<String> courses = new ArrayList<String>();
        String finish = "";
        String yn = "n";
        String temp;
        Scanner scan = new Scanner(System.in);
        boolean a;
        while (gradelevel > 12 || gradelevel < 9){
            temp = scan.nextLine();
            try {
                 gradelevel = Integer.parseInt(temp);
            } catch (Exception e){
                annoyed += 1;
                System.out.println(wrong[(int)(Math.random()/0.2)]);
            }
            if (gradelevel > 12 || gradelevel < 9) {
                System.out.print("That's not a valid high school grade. Try again. ");
            }
        }
        while (true) {
            String subject = "";
            while (!(subject.equals("math") || subject.equals("world language") || subject.equals("vapa") || subject.equals("science") || subject.equals("social studies"))){
                System.out.print("What subject do you want to choose a class for? We have math, world language, VAPA, science, and social studies classes available to choose from. ");
                subject = scan.nextLine().toLowerCase();
                if (!(subject.equals("math") || subject.equals("world language") || subject.equals("vapa") || subject.equals("science") || subject.equals("social studies"))){
                    System.out.println(wrong[(int)(Math.random()*5.0)]);
                    System.out.println("That's not an option. I currently only support math, world language, VAPA, science, and social studies classes. ");
                }
            }
            int hard = -1;

            System.out.print("On a scale of 1-10 how difficult do you want your classes? ");
            while (hard < 0 || hard > 10){
                temp = scan.nextLine();
                try {
                    hard = Integer.parseInt(temp);
                } catch (Exception e){
                    annoyed += 1;
                    System.out.println(wrong[(int)(Math.random()*5.0)]);
                }
                if (hard < 0 || hard > 10) {
                    System.out.println("That's not between 1 and 10. Please at least be capable of basic arithmetic.");
                }
            }
            if (hard > 8) hard = 4;
            else if (hard > 6) hard = 3;
            else if (hard > 4) hard = 2;
            else hard = 1;
                if (subject.equals("math")){
                    for (int i = 0; i < c.math.length; i++){
                        a = false;
                        for (int j : c.math[i].getGrade()) if (j == gradelevel) a = true;
                        if (c.math[i].getDiff() <= hard && a) {
                            System.out.println(c.math[i].getName() + " is " + c.math[i].getdesc());
                            System.out.print("Do you want to take " + c.math[i].getName() + "? (y/n) ");
                            yn = scan.nextLine().toLowerCase();
                            if (yn.equals("y")){
                                courses.add(c.math[i].getName());
                            }
                            }
                        }
                } else if (subject.equals("world language")){
                    for (int i = 0; i < c.lang.length; i++){
                        a = false;
                        for (int j : c.lang[i].getGrade()) if (j == gradelevel) a = true;
                        if (c.lang[i].getDiff() <= hard && a) {
                            System.out.println(c.lang[i].getName() + " is " + c.lang[i].getdesc());
                            System.out.print("Do you want to take " + c.lang[i].getName() + "? (y/n) ");
                            yn = scan.nextLine().toLowerCase();
                            if (yn.equals("y")){
                                courses.add(c.lang[i].getName());
                            }
                        }
                    }
                } else if (subject.equals("vapa")){
                    for (int i = 0; i < c.vapa.length; i++){
                        a = false;
                        for (int j : c.vapa[i].getGrade()) if (j == gradelevel) a = true;
                        if (c.vapa[i].getDiff() <= hard && a) {
                            System.out.println(c.vapa[i].getName() + " is " + c.vapa[i].getdesc());
                            System.out.print("Do you want to take " + c.vapa[i].getName() + "? (y/n) ");
                            yn = scan.nextLine().toLowerCase();
                            if (yn.equals("y")){
                                courses.add(c.vapa[i].getName());
                            }
                        }
                    }
                } else if (subject.equals("social studies")){
                    for (int i = 0; i < c.soc.length; i++){
                        a = false;
                        for (int j : c.soc[i].getGrade()) if (j == gradelevel) a = true;
                        if (c.soc[i].getDiff() <= hard && a) {
                            System.out.println(c.soc[i].getName() + " is " + c.soc[i].getdesc());
                            System.out.print("Do you want to take " + c.soc[i].getName() + "? (y/n) ");
                            yn = scan.nextLine().toLowerCase();
                            if (yn.equals("y")){
                                courses.add(c.soc[i].getName());
                            }
                        }
                    }
                } else if (subject.equals("science")){
                    for (int i = 0; i < c.sci.length; i++){
                        a = false;
                        for (int j : c.sci[i].getGrade()) if (j == gradelevel) a = true;
                        if (c.sci[i].getDiff() <= hard && a) {
                            System.out.println(c.sci[i].getName() + " is " + c.sci[i].getdesc());
                            System.out.print("Do you want to take " + c.sci[i].getName() + "? (y/n) ");
                            yn = scan.nextLine().toLowerCase();
                            if (yn.equals("y")){
                                courses.add(c.sci[i].getName());
                            }
                        }
                    }
                }
                System.out.print("Do you want to pick more classes? (y/n) ");
                finish = scan.nextLine().toLowerCase();
                if (finish.equals("n")){
                    System.out.println("Alright, that works.");
                    System.out.print("The classes you've pickeds are ");
                    for (int i = 0; i < courses.size()-1; i++){
                        System.out.print(courses.get(i) + ", ");
                    }
                    System.out.println("and " + courses.get(courses.size()-1) + ".");
                    break;
                }
        }
        
        if (annoyed >= 3){
            System.out.println("Thank you for being [EXTREMELY UNCOOPERATIVE] with my efforts. I am [DEFINITELY VERY GRATEFUL] for your help.");
            System.out.println("Do you want to hear a story?");
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
        scan.close();
    }
}


