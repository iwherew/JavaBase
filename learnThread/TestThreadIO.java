package learnThread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

// 实现多线程同步下载图片
public class TestThreadIO extends Thread{
    private String url;
    private String name;

    public TestThreadIO(String url, String name){
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url, name);
        System.out.println("下载了文件名为："+name);
    }

    public static void main(String[] args) {
        TestThreadIO t = new TestThreadIO("https://pic3.zhimg.com/v2-806bd13eb33e8f754e2f4e403ea47603_1440w.jpg?source=172ae18b","dog1.jpg");
        TestThreadIO t1 = new TestThreadIO("https://pic3.zhimg.com/v2-806bd13eb33e8f754e2f4e403ea47603_1440w.jpg?source=172ae18b","dog2.jpg");
        TestThreadIO t2 = new TestThreadIO("https://pic3.zhimg.com/v2-806bd13eb33e8f754e2f4e403ea47603_1440w.jpg?source=172ae18b","dog3.jpg");

        t.start();
        t1.start();
        t2.start();

        // 执行顺序不一样：2 1 3
    }
}

// 下载器
class WebDownloader{
    // 下载方法
    public void downloader(String url, String name){
        try {
            FileUtils.copyURLToFile(new URL(url), new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常，downloader方法出现问题");
        }
    }
}
