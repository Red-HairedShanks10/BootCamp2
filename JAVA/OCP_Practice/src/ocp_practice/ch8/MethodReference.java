package ocp_practice.ch8;

public class MethodReference {
}


class DuckHelper{
    public static void teacher(String name, LearnToSpeak trainer) {
        // Exercise patience (omitted)
        trainer.speak(name);
    }
}

class Duckling{
    public static void makeSound(String sound) {
        LearnToSpeak learner = s ->
                System.out.println(s);
        DuckHelper.teacher(sound, learner);
    }
}