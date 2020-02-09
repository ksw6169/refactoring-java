package org.corgi.refactoring.chapter9.replaceTypeCodeWithStateStrategy.exercise.after;

public class Player {

    private Media media = Media.NULL;

    public void setMedia(Media media) {
        if (media == null) {
            this.media = Media.NULL;
        } else {
            this.media = media;
        }
    }

    public void play() {
        this.media.play();
    }

    public void loop() {
        this.media.loop();
    }

    public void stop() {
        this.media.stop();
    }
}
