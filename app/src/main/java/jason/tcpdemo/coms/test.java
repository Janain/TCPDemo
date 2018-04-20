package jason.tcpdemo.coms;

/**
 * @Author Wangjj
 * @Create 2018/4/20.
 * @Content
 */
public class test {
    public static void main(String[] args) {
        new TcpClient("",11);

        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });

    }
}
