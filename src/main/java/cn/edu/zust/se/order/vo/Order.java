package cn.edu.zust.se.order.vo;

public class Order {
    int id;
    int order_id;
    int goods_id;
    int num;

    public Order(){

    }
    public Order(int id,int order_id,int goods_id,int num){
        this.id=id;
        this.order_id=order_id;
        this.goods_id=goods_id;
        this.num=num;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setGoods_id(int goods_id) {
        this.goods_id = goods_id;
    }

    public int getGoods_id() {
        return goods_id;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getOrder_id() {
        return order_id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", order_id=" + order_id +
                ", goods_id=" + goods_id +
                ", num=" + num +
                '}';
    }
}
