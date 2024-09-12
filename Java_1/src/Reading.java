import java.util.Scanner;
import java.io.File;  // to access file

class Reading {
    public static void main(String[] args) {
        try{  // file handling should be done in try catch block. Because, if the file doesn't exist there might be an error
            File f = new File("Hello.txt");  // if java file and txt file are in the same folder, we can give only filename.txt
            Scanner reader = new Scanner(f);
            while(reader.hasNextLine()){  // checks whether there is a line, if so, it will be printed
                System.out.println(reader.nextLine());
            }
        }
        catch(Exception E){
            System.out.println(E);
        }
    }
}

// if there no content in file(empty file) => nothing will be printed, but there is no error
// if there is no such file => Exception is raised 

// if we don't use try catch block for file handling, it won't  work. There will be an error shown in the code