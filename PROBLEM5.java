interface Playable {
    void play();
    void stop();
}

class MP3Player implements Playable {
    @Override
    public void play() {
        System.out.println("MP3 Player is playing music.");
    }

    @Override
    public void stop() {
        System.out.println("MP3 Player stopped.");
    }
}

class RADIO implements Playable {
    @Override
    public void play() {
        System.out.println("Radio is playing.");
    }

    @Override
    public void stop() {
        System.out.println("Radio stopped.");
    }
}

public class PROBLEM5 {
    public static void main(String[] args) {
        Playable mp3Player = new MP3Player();
        mp3Player.play();
        mp3Player.stop();

        System.out.println();

        Playable radio = new RADIO();
        radio.play();
        radio.stop();

    }
}

