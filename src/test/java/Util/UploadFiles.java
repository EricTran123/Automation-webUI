package Util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class UploadFiles {
    WebDriver driver = null;
    /**
     *
     * @Description: 在百度云上测试文件批量上传功能，主要是通过循环的方式去做单一
     * 的上传动作 , 登陆过程已经去掉
     */
    public void uploadFiles() throws Exception {
        System.out.println("upload start");
        // 获取上传控件元素
        WebElement uploadButton = driver.findElement(By.name("html5uploader"));
        // 构建上传文件路径，将需要上传的文件添加到 CharSequence 数组
        CharSequence[] files = new CharSequence[5];
        files[0] = "C:\\test\\test1.txt";
        files[1] = "C:\\test\\test2.txt";
        files[2] = "C:\\test\\test3.txt";
        files[3] = "C:\\test\\test4.txt";
        files[4] = "C:\\test\\test5.txt";
        // 循环列出每支需要上传的文件路径，做单一上传动作
        for(CharSequence file: files){
            uploadButton.sendKeys(file);
        }
        Thread.sleep(2000);
        System.out.println("upload end");
    }
}
