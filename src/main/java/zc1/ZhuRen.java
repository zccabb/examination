package zc1;

/**
 * @Author: zcc
 * @Created_on: 2022/5/27/13:33
 * ./ZhuRen.java
 */
public class ZhuRen extends Handler {
    static int limit = 2;

    @Override
    public boolean handle(Request req) {
        if (req.day <= limit){
            System.out.println("不超过2天，主任同意!");
            return true;
        }else{
            System.out.println("超过2天组长无权同意，请找上级");
        }
        return getNext().handle(req);
    }
}
