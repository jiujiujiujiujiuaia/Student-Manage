package sample;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by 87057 on 2018/3/12.
 */
public class Testdemo {
    public int a;
    public void add(){

        a = 10;
    }
    public static void main(String[] args){
        Testdemo c = new Testdemo();
        Testdemo b = new Testdemo();
        StdOut.println(b.a);
        b.add();
        StdOut.println(b.a);
        StdOut.println(c.a);
    }
}
