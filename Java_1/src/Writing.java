import java.io.File;
import java.io.FileWriter;  // to write to file

class Writing {
    public static void main(String[] args) {
        try{
            File f = new File("Hello.txt");  // File is opened while they are created
            FileWriter fw = new FileWriter(f);
            fw.write("Hello! Let's get started!!");
            fw.close();  // it's a good practice to close the file after file handling 
        }
        catch(Exception E){
            System.out.println(E);
        }
    }
}
