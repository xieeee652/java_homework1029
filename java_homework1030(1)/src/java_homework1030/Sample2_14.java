package java_homework1030;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Sample2_14
{
    public static void main(String[] args)throws IOException
    {
        System.out.println("�аݭn�b�ĴX���B�z�����j��O�H(1~10)");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        int res = Integer.parseInt(str);
        
        for(int i = 1; i <= 10; i++)
            {
                if(i ==res)
                continue;
                System.out.println("��" + i + "�����B�z");
            }
    }                
}
