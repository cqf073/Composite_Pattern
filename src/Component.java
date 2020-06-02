import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/6/212:06
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
//抽象构建
public interface Component {
    void kill();
}
class imagekill implements Component{
    private String name;

    public imagekill(String name) {
        super();
        this.name = name;
    }

    @Override
    public void kill() {
        System.out.println("杀图片"+name);

    }
}
class textkill implements Component{
    private String name;

    public textkill(String name) {
        super();
        this.name = name;
    }

    @Override
    public void kill() {
        System.out.println("杀文本"+name);

    }
}
class folder implements Component{
    private  String name;
    private List<Component> list= new ArrayList<Component>();


    public folder(String name) {
        super();
        this.name = name;
    }
    public  void add(Component component){
        list.add(component);

    }
    public  void remove(Component component){
        list.remove(component);
    }
    public Component get(int index){
        return list.get(index);

    }

    @Override
    public void kill() {
        System.out.println("杀毒"+name);
        for (Component file:list) {
            file.kill();

        }
    }
}