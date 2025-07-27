import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.nio.charset.StandardCharsets;

class Main{
    public static void main(String[] args) {
        Student s1=new Student("John",21,23);

        Main obj=new Main();
        obj.WriteStudentInfo(s1);
        obj.ReadStudentInfo();
        Student s2= new Student("Alex",12,21);
        obj.AppendStudent(s2);
        obj.ReadStudentInfo();

    }

    //WRITE OPERATION OF STUDENT TO A FILE
    public void WriteStudentInfo(Student student)  {
        try(FileOutputStream fos=new FileOutputStream("Output.txt");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        BufferedWriter br= new BufferedWriter(outputStreamWriter);

        ) {

            br.write(student.toString());
            br.newLine();
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    //READ OPERATION FROM A FILE
    public  void ReadStudentInfo()
    {
        try {
            FileReader reader=new FileReader("Output.txt");
            BufferedReader br = new BufferedReader(reader);
            String line;

            while((line=br.readLine())!= null) {
                System.out.println(line);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    //APPEND MORE STUDENT TO A FILE
    public void AppendStudent(Student s2)
    {
        try(FileWriter fw=new FileWriter("Output.txt",true);
            BufferedWriter br=new BufferedWriter(fw);
        )
        {
            br.write(s2.toString());
            br.flush();
            System.out.println("Data Appended");
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

}