package com.zccl.ruiqianqi.mind.voice.alexa.beans.event;

import java.util.ArrayList;

/**
 * Created by ruiqianqi on 2017/2/15 0015.
 */

public class SynchronizeStateEvent {
    public ArrayList<Object> context = new ArrayList<>();
    public SynchronizeStateMsg event = new SynchronizeStateMsg();
}
