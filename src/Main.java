public class Main {

    public static void main(String[] args) {
        folder f1 =new folder("文件夹");
        Component f2=new imagekill("图片。jpg");
        Component f3= new textkill("文本。txt");
        System.out.println("*****图片的查杀*****");
        f2.kill();
        System.out.println("*****文本的查杀*****");
        f3.kill();
        f1.add(f2);
        f1.add(f3);
        System.out.println("*****文件夹的查杀*****");
        f1.kill();



    }
}
