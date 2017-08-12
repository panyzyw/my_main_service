package com.zccl.ruiqianqi.mind.voice.alexa.beans.event;

/**
 * Created by ruiqianqi on 2017/7/26 0026.
 */

public class SetAlertSucceededEvent extends BaseEvent {
    public Payload payload = new Payload();

    public SetAlertSucceededEvent(){
        header.namespace = "Alerts";
        header.name = "SetAlertSucceeded";
    }

    public class Payload{
        /**
         * An opaque token that uniquely identifies the alert
         */
        public String token;
    }
}