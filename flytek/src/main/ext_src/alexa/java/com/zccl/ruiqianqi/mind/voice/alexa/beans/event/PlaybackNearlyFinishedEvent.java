package com.zccl.ruiqianqi.mind.voice.alexa.beans.event;

/**
 * Created by ruiqianqi on 2017/7/26 0026.
 */

public class PlaybackNearlyFinishedEvent extends BaseEvent {
    public Payload payload = new Payload();

    public PlaybackNearlyFinishedEvent(){
        header.namespace = "AudioPlayer";
        header.name = "PlaybackNearlyFinished";
    }

    public class Payload{
        /**
         * An opaque token that uniquely identifies the alert
         */
        public String token;

        /**
         * Identifies a track's current offset in milliseconds
         */
        public long offsetInMilliseconds;
    }
}
