public class p28 {

 
    public void display() {
        String name="maruf";
        System.out.println(name);
    }

    String getName() {
        return "Hasan";
    }

    String displayinfo(String name){
        return name;
    }



    public static void main(String[] args) {

        p28 a =new p28();
        a.display();
        String n=a.getName();
        System.out.println(n);
        String info=a.displayinfo("Chowdhury");
        System.out.println(info);



        
    }
    
}
