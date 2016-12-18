/**   
 * @Title: ThreadDemo_1.java

 * @Description: TODO(演示单一线程的运行流程)

 * @date 2014年5月3日 

 */
public class ThreadDemo_1
{
    public static void main( String args[] )
    {
        new TestThread().run();
        // 循环输出
        for( int i = 0; i < 5; ++i )
        {
            System.out.println( "main 线程在运行" );
        }
    }
}

class TestThread
{
    public void run()
    {
        for( int i = 0; i < 5; ++i )
        {
            System.out.println( "TestThread 在运行" );
        }
    }
}


//此处就是增加了注释
