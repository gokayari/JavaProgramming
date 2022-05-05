package day44_Abstraction.animalTask;

public interface Playable {     //it is not a class, it is a supertype

    //public abstract void play(); //it is not necessary to put "public",
    //abstract void play();     // and also "abstract"

    void play();    //abstract by default

    //static boolean isFriendly = true;
    boolean isFriendly = true;  //static & final by default
}
