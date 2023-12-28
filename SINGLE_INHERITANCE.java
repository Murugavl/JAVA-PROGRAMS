import java.util.*;
class pipe_dream
  {
    void open()
    {
      System.out.println("Pipedream is Opening");
    }
  }
class github extends pipe_dream
  {
    void run()
    {
      System.out.println("GitHub is Running");
    }
  }
class Main
  {
    public static void main(String args[])
    {
      github g=new github();
      g.open();
      g.run();
    }
  }
