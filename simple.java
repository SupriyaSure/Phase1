package array;
class simple{
    int id=78;
    String name="Amul";
    void display() {
        System.out.println(id+" "+name);
    }
    
}
class A extends simple{
    int count=50;
    String catagory="butter";
    void display() {
        System.out.println(id+" "+name+" "+ " "+count+" "+ catagory );
    }
}
class subA extends A{
    int price=30;
    void totalprice() {
        int tp;
        tp=count*price;
        
        System.out.println(id+" "+name+" "+ catagory+"total price"+tp);
    }
}
class B extends simple{
    int count=90;
    String catagory="Milk";
    void display() {
        System.out.println(id+" "+name+" "+ " "+count+" "+ catagory );
    }
}
class subB extends B{
    int price=10;
    void totalprice() {
        int tp;
        tp=count*price;
        
        System.out.println(id+" "+name+" "+ catagory+"total price"+tp);
    }
}
class C extends simple{
    int count=56;
    String catagory="choco";
    void display() {
        System.out.println(id+" "+name+" "+ " "+count+" "+ catagory );
    }
}
