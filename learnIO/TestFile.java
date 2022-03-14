package learnIO;

import java.io.File;
import java.io.FileFilter;
import java.util.Date;

public class TestFile {
    public static void main(String[] args) throws Exception{
//        separator();
//        fileOpe();
        directoryOpe();
    }

    // (1) 分隔符
    public static void separator(){
        System.out.println("路径分隔符："+ File.pathSeparator); // ;
        System.out.println("名称分隔符："+ File.separator); // \
    }

    // (2) 文件操作
    public static void fileOpe() throws Exception{
        // 1 创建文件
        File file = new File("d:\\file.txt");
        System.out.println(file.toString());
        if(!file.exists()){
            boolean successCreate = file.createNewFile();
            System.out.println("创建结果："+successCreate);
        }
        // 2 删除文件
        // 2.1 直接删除
//        boolean successDelete = file.delete();
//        System.out.println("删除结果："+successDelete);
        // 2.2 使用jvm退出时删除
//        file.deleteOnExit();
//        Thread.sleep(5000);


        // 3 获取文件信息
        System.out.println("文件绝对路径："+file.getAbsolutePath());
        System.out.println("文件路径："+file.getPath());
        System.out.println("文件名称："+file.getName());
        System.out.println("文件父级目录："+file.getParent());
        System.out.println("文件长度："+file.length());
        System.out.println("文件创建时间："+new Date(file.lastModified()).toLocaleString());

        // 4 判断
        System.out.println("是否可写："+file.canWrite());
        System.out.println("是否是文件："+file.isFile());
        System.out.println("是否隐藏："+file.isHidden());
    }

    // (3) 文件夹操作
    public static void directoryOpe() throws Exception{
        // 1 创建文件夹
        File dir = new File("d:\\dir");
        System.out.println(dir.toString());
        if(!dir.exists()){
//            dir.mkdir(); // 只能创建单级目录
            boolean successCreate = dir.mkdirs(); // 创建多目录
            System.out.println("创建结果："+successCreate);
        }

        // 2 删除文件夹
        // 2.1 直接删除
//        boolean successDelete = dir.delete(); // 只删除最下层的目录，只能删除空目录
//        System.out.println("删除结果："+successDelete);
        // 2.2 使用jvm删除
//        dir.deleteOnExit();
//        Thread.sleep(5000);

        // 3 获取文件夹信息
        System.out.println("绝对路径："+dir.getAbsolutePath());
        System.out.println("路径："+dir.getPath());
        System.out.println("名称："+dir.getName());
        System.out.println("父级目录："+dir.getParent());
        System.out.println("创建时间："+new Date(dir.lastModified()).toLocaleString());

        // 4 判断
        System.out.println("是否是文件夹："+dir.isDirectory());
        System.out.println("是否隐藏："+dir.isHidden());

        // 5 遍历文件夹
        File dir2 = new File("F:\\download\\晋升标准");
        String[] files = dir2.list();
        System.out.println("-----------------");
        for(String str : files){
            System.out.println(str);
        }
        // FileFilter 文件过滤
        System.out.println("------FileFilter-----");
        File[] files2 = dir2.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().indexOf("标准") != -1;
            }
        });
        for(File file : files2){
            System.out.println(file.getName());
        }
    }
}
