package org.corgi.refactoring.chapter9.replacetypecodewithstatestrategy.exercise.after;

public enum Media {

    VIDEO {
        @Override
        public void play() {
            System.out.println("Video: play");
        }

        @Override
        public void loop() {
            System.out.println("Video: loop");
        }

        @Override
        public void stop() {
            System.out.println("Video: stop");
        }
    },

    MUSIC {
        @Override
        public void play() {
            System.out.println("MUSIC: play");
        }

        @Override
        public void loop() {
            System.out.println("MUSIC: loop");
        }

        @Override
        public void stop() {
            System.out.println("MUSIC: stop");
        }
    },

    NULL {
        @Override
        public void play() {
            System.out.println("NULL: play");
        }

        @Override
        public void loop() {
            System.out.println("NULL: loop");
        }

        @Override
        public void stop() {
            System.out.println("NULL: stop");
        }
    };

    public abstract void play();
    public abstract void loop();
    public abstract void stop();
}
