package xyz.xingfeng.minecraft;

import javax.swing.*;
import java.io.File;

public class IsAssets{
    String path ;
    public IsAssets(String path){
        this.path = path + "/indexes";
        File file = new File(this.path);
        for (File t : file.listFiles()) {
            if (t.isFile()) {
                Window.json.add(t.getName().replaceAll(".json",""));
            }
        }
    }
}
