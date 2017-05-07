package Concurrent.ThinkingInJava.unit19;

/**
 * Created by hao on 17-5-2.
 */
public enum OzWitch {
    WEST("Miss Gulch,aka the Wicked Witch of the West"),
    NORTH("Glinda, the Good Witch of the North"),
    EAST("Wicked Witch of the East, water of the Ruby"),
    SOUTH("gOOD by inference, but missing");   //调用构造器创建了四个static final对象

    private String description;

    OzWitch(String description){  //构造器,默认是private
        this.description=description;
    }

    public  String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        String id=this.name();
        String lower=id.substring(1).toLowerCase();
        return id.charAt(0)+lower;
    }

    public static void main(String[] args) {
        for(OzWitch witch:OzWitch.values()){  //values是个静态方法
            System.out.println(witch +": "+witch.getDescription());
        }
    }
}
