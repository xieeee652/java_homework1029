package java_homework1030;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Sample2_7
{
    public static void main(String[] args)throws IOException
    {
        System.out.println("�аݧA�O�k�ͶܡH");
        System.out.println("�п�J��΢�");
        
        
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        String str = br.readLine();
        
        char letter = str.charAt(0);
        
        if(letter == 'Y'||letter == 'y')
            {
                 System.out.println("�A�O�k�Ͱ�");
                
            }
        else if(letter == 'N' || letter == 'n')    
                {
                    System.out.println("�A�O�k�Ͱ�");
                }
        else
                {
                    System.out.println("�п�JY�΢�");
                    
                }
     }
}


