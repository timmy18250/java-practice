class cat {
    String name;
    String color;

    public cat (String catname,String catcolor) {
        name = catname;
        color = catcolor;
        System.out.println("工廠廣播：一隻叫做 " + name + " 的 " + color + " 機器狗誕生了！");
    }

    public void bark() {
        System.out.println(name + " 說：喵喵喵！");
    }

    public void run() {
        System.out.println(name + "正在開心地跑來跑去");
    }
}

public class practice {
    public static void main(String[] args) {
        cat mycat = new cat("小白", "白色");

        System.out.println("貓咪已經送到家了");

        mycat.bark();
        mycat.run();
        mycat.bark();
    }
}



