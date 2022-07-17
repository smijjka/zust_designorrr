package cn.edu.zust.se.order.vo;

public class Report {
    int id;
    int er_id;
    int goods_id;
    String submit_time;
    String content;
    int status;
    public Report(int id,int er_id,int goods_id,String submit_time,String content,int status){
        this.id=id;
        this.er_id=er_id;
        this.goods_id=goods_id;
        this.submit_time=submit_time;
        this.content=content;
        this.status=status;
    }
    public Report(){}

    @Override
    public String toString() {
        return "Report{" +
                "id=" + id +
                ", er_id=" + er_id +
                ", goods_id=" + goods_id +
                ", submit_time='" + submit_time + '\'' +
                ", content='" + content + '\'' +
                ", status=" + status +
                '}';
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSubmit_time() {
        return submit_time;
    }

    public void setSubmit_time(String submit_time) {
        this.submit_time = submit_time;
    }

    public int getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(int goods_id) {
        this.goods_id = goods_id;
    }

    public int getEr_id() {
        return er_id;
    }

    public void setEr_id(int er_id) {
        this.er_id = er_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
