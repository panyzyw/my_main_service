package com.zccl.ruiqianqi.mind.voice.alexa.beans.event;

/**
 * Created by ruiqianqi on 2017/7/26 0026.
 */

public class AlertEnteredBackgroundEvent extends BaseEvent {
    public Payload payload = new Payload();

    public AlertEnteredBackgroundEvent(){
        header.namespace = "Alerts";
        header.name = "AlertEnteredBackground";
    }

    public class Payload{
        /**
         * An opaque token that uniquely identifies the alert
         */
        public String token;
    }
}
