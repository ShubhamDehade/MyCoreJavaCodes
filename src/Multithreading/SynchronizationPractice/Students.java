package Multithreading.SynchronizationPractice;

public class Students extends Thread{
    String name;
    WhiteBoard wb;
    public Students(String n,WhiteBoard w)
    {
        name=n;
        wb=w;
    }

    public void run()
    {
        String text;
        wb.attendance();

        do
        {
            text=wb.read();
            System.out.println(name + " Reading " + text);
        }while(!text.equals("end"));
    }
}
