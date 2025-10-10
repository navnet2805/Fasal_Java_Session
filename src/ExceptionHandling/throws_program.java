package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.IOException;

public class throws_program {

//    public static void m01() throws IOException
//    {
//        throw new IOException("File not found");
//    }

    public static void main(String[] args) throws IOException, FileNotFoundException {
        try{
            throw new IOException("File not found");
        }catch (Exception e)
        {
            System.out.println("Exception handled");
        }
    }
}
