package cn.edu.zust.se.order.vo;

public class T_order {
    int id;
    int buyer_id;
    int sell_id;
    String order_time;
    String submit_time;
    int amount;
    int status;
int goods_id;
int price;

    @Override
    public String toString() {
        return "T_order{" +
                "id=" + id +
                ", buyer_id=" + buyer_id +
                ", sell_id=" + sell_id +
                ", order_time='" + order_time + '\'' +
                ", submit_time='" + submit_time + '\'' +
                ", amount=" + amount +
                ", status=" + status +
                ", goods_id=" + goods_id +
                ", price=" + price +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(int goods_id) {
        this.goods_id = goods_id;
    }



    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getSubmit_time() {
        return submit_time;
    }

    public void setSubmit_time(String submit_time) {
        this.submit_time = submit_time;
    }

    public String getOrder_time() {
        return order_time;
    }

    public void setOrder_time(String order_time) {
        this.order_time = order_time;
    }

    public int getSell_id() {
        return sell_id;
    }

    public void setSell_id(int sell_id) {
        this.sell_id = sell_id;
    }

    public int getBuyer_id() {
        return buyer_id;
    }

    public void setBuyer_id(int buyer_id) {
        this.buyer_id = buyer_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
