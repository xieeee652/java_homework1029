package java_homework1030;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Sample2_51
{
    public static void main(String[] args)throws IOException
    {
        System.out.println("�п�J���");
        
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        
        switch(num)
        {
            case 1:
                {
                    System.out.println("��J���O1");
                    
                }
            case 2:
                {
                    System.out.println("��J���O2");
                }
            default:
                {
                    System.out.println("�п�J1��2");
                }
        }
    }
}

