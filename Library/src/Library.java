import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class Library {
    public static void main(String args[]) {
        String welcomeMsg = "Welcome to the Library";
        String question = "How would you like to search for your book today? \n- Author \n- Name \n- Year ";
        String userInput;
        Booklist list = new Booklist();

        System.out.println(welcomeMsg);
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));


        try {
            System.out.println(question);
            while((userInput = buf.readLine()) != null) {

                switch (userInput) {
                    case "Author":
                        System.out.println("What is the author's name?");
                        String authorInput;
                        while ((authorInput = buf.readLine()) != null) {
                            Iterator<Books> itr = list.allBooks.iterator();
                            while(itr.hasNext()) {
                                Books bk = itr.next();
                                if(authorInput.equalsIgnoreCase(bk.getAuthor()) ||bk.getAuthor().contains(authorInput)) {
                                    System.out.println(bk.getBookname() + " " + bk.getAuthor() + " " + bk.getYear());
                                }
                            }
                        }
                        break;
                    case "Name":
                        System.out.println("What is the book's name?");
                        String bookInput;
                        while ((bookInput = buf.readLine()) != null) {
                            Iterator<Books> itr = list.allBooks.iterator();
                            while(itr.hasNext()) {
                                Books bk = itr.next();
                                if(bookInput.equalsIgnoreCase(bk.getBookname()) ||bk.getBookname().contains(bookInput)) {
                                    System.out.println(bk.getBookname() + " " + bk.getAuthor() + " " + bk.getYear());
                                }
                            }
                        }
                        break;
                    case "Year":
                        System.out.println("When was your desired book published in?");
                        String newInput;
                        while ((newInput = buf.readLine()) != null) {
                            int yearInput = Integer.parseInt(newInput);
                            Iterator<Books> itr = list.allBooks.iterator();
                            while(itr.hasNext()) {
                                Books bk = itr.next();
                                if(bk.getYear() == yearInput) {
                                    System.out.println(bk.getBookname() + " " + bk.getAuthor() + " " + bk.getYear());
                                }
                            }

                        }
                        break;
                    default:
                        System.out.println("that's not an option");
                        break;
                }


            }
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }

}
