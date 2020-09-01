package com.roy.io;

import java.io.*;

public class zijieliu {
    private String path="d://a.txt";

    public void out() throws IOException {
        File file = new File(path);

        OutputStream os = new FileOutputStream(file);

        String luna = "仙狗儿";

        os.write(luna.getBytes());
    }
    public void in(){
        try {
            File file = new File(path);

            InputStream is = new FileInputStream(file);

            int len = 0;

            byte[] b = new byte[32];

            String content="";
            while ((len = is.read(b))!= -1){

                String temp = new String(b,0,len);

                content+=temp;

            }
            is.close();

            System.out.println(content);
        }catch (Exception e){

        }
    }
}
