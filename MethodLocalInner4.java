class MethodLocalInner4
{
  public void mth1()
  {  
    int x=10;
    class Inner
    {
      public void mth2()
      {
        System.out.println(x);
      }
    }
    Inner inner=new Inner();
    inner.mth2();
  }

  public static void main(String[] args)
  {
    MethodLocalInner4 i1= new MethodLocalInner4();
    i1.mth1();
  }
}