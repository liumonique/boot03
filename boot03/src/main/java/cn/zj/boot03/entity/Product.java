package cn.zj.boot03.entity;

/*
* +-------+--------------+------+-----+---------+----------------+
| Field | Type         | Null | Key | Default | Extra          |
+-------+--------------+------+-----+---------+----------------+
| id    | int          | NO   | PRI | NULL    | auto_increment |
| title | varchar(100) | YES  |     | NULL    |                |
| price | double(10,2) | YES  |     | NULL    |                |
| num   | int          | YES  |     | NULL    |                |
+-------+--------------+------+-----+---------+----------------+
* */
public class Product {
    // 创建GetterSetter 和 toString
    private Integer id;
    private String title;
    private Double price;
    private Integer num;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", num=" + num +
                '}';
    }
}


