interface Jump {
    void jump();
}

interface Shoot {
    void shoot();
}

interface Run {
    void run();
}

class Hero implements Jump, Shoot, Run {
    public void jump() {
        System.out.println("Hero jumps 10 feet high!");
    }
    public void shoot() {
        System.out.println("Hero shoots fire bullets!");
    }
    public void run() {
        System.out.println("Hero runs at 50 km/h!");
    }
}

public class day20 {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.jump();
        h.shoot();
        h.run();
    }
}

