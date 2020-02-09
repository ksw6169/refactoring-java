package org.corgi.refactoring.chapter9.replacetypecodewithstatestrategy.exercise.before;

import java.util.function.Predicate;

public class Player {

    private Media media = Media.NULL;

    public void play() {
        if (this.media == Media.VIDEO) {
            System.out.println("Video: play");
        } else if (this.media == Media.MUSIC) {
            System.out.println("Music: play");
        } else if (this.media == Media.NULL) {
            System.out.println("Null: play");
        } else {
            assert false;
        }
    }

    public void loop() {
        if (this.media == Media.VIDEO) {
            System.out.println("Video: loop");
        } else if (this.media == Media.MUSIC) {
            System.out.println("Music: loop");
        } else if (this.media == Media.NULL) {
            System.out.println("Null: loop");
        } else {
            assert false;
        }
    }

    public void stop() {
        if (this.media == Media.VIDEO) {
            System.out.println("Video: stop");
        } else if (this.media == Media.MUSIC) {
            System.out.println("Music: stop");
        } else if (this.media == Media.NULL) {
            System.out.println("Null: stop");
        } else {
            assert false;
        }
    }


    public void setMedia(Media media) {
        if (media == null) {
            this.media = Media.NULL;
        } else {
            this.media = media;
        }
    }
}
