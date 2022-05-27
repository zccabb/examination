package zc1;

/**
 * @Author: zcc
 * @Created_on: 2022/5/27/13:33
 * ./ZuZhang.java
 */
public class ZuZhang extends Handler{
    static int limit = 1;

    @Override
    public boolean handle(Request req) {
        if (req.day <= limit){
            System.out.println("不超过一天，组长同意!");
            return true;
        }else{
            System.out.println("超过1天组长无权同意，请找上级");
        }
        return getNext().handle(req);
    }
}
