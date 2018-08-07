package human;

/**
 * Created by Yulya.Maksymiv_qa on 07.08.2018.
 */
class Men extends Human implements iTalk
{
    @Override
    public void talk()
    {
        System.out.println("I talk");
    }
  //  @Override
    public void sleep ()
    {
        //super.sleep();
      System.out.println("I want sleep");
    }
}
