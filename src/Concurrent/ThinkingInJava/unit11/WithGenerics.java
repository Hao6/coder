package Concurrent.ThinkingInJava.unit11;

import java.util.*;

/**
 * Created by hao on 17-5-11.
 */
class Animal{
    String name;
    public Animal(String name){
        this.name=name;
    }
}
class Species{
    int kind;
    public Species(int kind){
        this.kind=kind;
    }
}
public class WithGenerics {
    List<Animal> animals=new ArrayList<>();
    Set<Animal> animalSet=new HashSet<>();
    Map<Animal,Species> animalSpeciesMap=new HashMap<>();


    public void testNull(){
        Animal a=null;
        animals.add(a);
        animals.add(null);
        animalSet.add(a);
        animalSet.add(new Animal("monkey2"));
        animalSet.add(new Animal("monkey"));
        animalSet.add(new Animal("monkey3"));


        animalSpeciesMap.put(null,null);
        animalSpeciesMap.put(null,new Species(1));
        animalSpeciesMap.put(new Animal("tiger"),null);
        animalSpeciesMap.put(new Animal("lion"),null);


    }
    public void testForeach(){
        for(Animal animal:animals){
            if(animal !=null){
                System.out.println(animal.name);
            }
        }
        for(Animal animal:animalSet){
            if(animal!=null){
                System.out.println(animal.name);
            }
        }
    }

    public void testList(){
        Animal a=new Animal("spider");
        Animal b=a;
        animals.add(a);  //添加的是指向new Animal("spider")的引用
        animals.add(b);
        for(Animal animal:animals){
            if(animal !=null){
                System.out.println(animal.name);
            }
        }
        a.name="pig";
        for(Animal animal:animals){
            if(animal !=null){
                System.out.println(animal.name);
            }
        }

    }
    public void testSet(){
        Animal a=new Animal("pig");
        Animal b=a;
        animalSet.add(a);  //添加的是指向new Animal("spider")的引用
        animalSet.add(b);  //由于a与b指向的是同一个对象，所以set只会添加一个
        for(Animal animal:animalSet){
            if(animal !=null){
                System.out.println(animal.name);
            }
        }
        a.name="spider";
        for(Animal animal:animalSet){
            if(animal !=null){
                System.out.println(animal.name);
            }
        }

    }


    public static void main(String []args){
        WithGenerics wg=new WithGenerics();
//        wg.testNull();
//        wg.testForeach();
        wg.testSet();
    }
}
