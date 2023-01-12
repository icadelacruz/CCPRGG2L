
package FileHandling;

import java.util.Scanner;
import java.io.*;

public class Login {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("accounts.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        Scanner in = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username_ = in.nextLine();
        
        try{
            String line;
            String username;
            String password_;
            boolean exists = false;
            while((line = br.readLine()) != null){
                for (int i = 0; i < line.length(); i++) {
                    if(line.charAt(i)=='\t'){
                        username = line.substring(0,i);
//                        System.out.println(username);
                        if(username.equals(username_)){
                            exists = true;
                            System.out.println("Enter password: ");
                            password_ = in.nextLine();
                            if(password_.equals(line.substring(i+1))){
                                System.out.println("Sucessfully entered the program!");
                            }
                            else{
                                System.out.println("Invalid password.");
                            }
                        }
                    }
                }
            }
            if(!exists){
                System.out.println("Invalid username");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
