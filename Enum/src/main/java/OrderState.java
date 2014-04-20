/**
 * Created with IntelliJ IDEA.
 * User: Loong
 * Date: 13-3-31
 * Time: 下午3:18
 * To change this template use File | Settings | File Templates.
 */
public enum OrderState {

    /** 已取消 */
    CANCEL {public String getName(){return "已取消";}},
    /** 待审核 */
    WAITCONFIRM {public String getName(){return "待审核";}},
    /** 等待付款 */
    WAITPAYMENT {public String getName(){return "等待付款";}},
    /** 正在配货 */
    ADMEASUREPRODUCT {public String getName(){return "正在配货";}},
    /** 等待发货 */
    WAITDELIVER {public String getName(){return "等待发货";}},
    /** 已发货 */
    DELIVERED {public String getName(){return "已发货";}},
    /** 已收货 */
    RECEIVED {public String getName(){return "已收货";}};

    public abstract String getName();

    public static void main(String[] args) {
        System.out.println(OrderState.CANCEL.getName());

        OrderState orderState =OrderState.CANCEL;

        switch (orderState) {
            case CANCEL:
                System.out.println(CANCEL.getName());
                break;
            case WAITCONFIRM:
                System.out.println(WAITCONFIRM.getName());
                break;
            case WAITDELIVER:
                System.out.println(WAITDELIVER.getName());
                break;
            case WAITPAYMENT:
                System.out.println(WAITPAYMENT.getName());
                break;
        }
    }
}
