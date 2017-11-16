package com.example.vishalprasad.picasso_imageview;

/**
 * Created by Vishal Prasad on 2/20/2017.
 */

public class ImageArray {

    String[] imagelink= new String[5];

    public ImageArray()
    {
        imagelink[0]="http://yasequeregalar.es/wp-content/uploads/2015/06/minion-bob.jpg";
        imagelink[1]="https://s-media-cache-ak0.pinimg.com/564x/2b/e9/06/2be906d4533a8923005d277f67b096e8.jpg";
        imagelink[2]="https://s-media-cache-ak0.pinimg.com/originals/33/05/93/330593b280a0c9132cbd5f3c41bcf3fd.jpg";
        imagelink[3]="https://s-media-cache-ak0.pinimg.com/736x/7f/75/6b/7f756bcb3481db56650768cc5fc0cf50.jpg";
        imagelink[4]="https://s-media-cache-ak0.pinimg.com/736x/ff/07/2a/ff072a39a2709e4fec2cd05e3763d68d.jpg";
    }

    public String getstring(int x)
    {
        return imagelink[x];
    }

}
