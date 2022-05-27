package zc1;

/**
 * @Author: zcc
 * @Created_on: 2022/5/27/13:28
 * ./zc1.java
 */
public class zc1 {
    public static void main(String[] args) {
        Handler one = new ZuZhang();
        Handler two = new ZhuRen();
        Handler three = new JingLi();
        one.setNext(two);
        two.setNext(three);
        Request req=new Request(4);
        one.handle(req);
    }
}
