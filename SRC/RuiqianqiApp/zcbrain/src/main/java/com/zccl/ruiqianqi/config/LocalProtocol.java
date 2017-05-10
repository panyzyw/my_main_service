package com.zccl.ruiqianqi.config;

/**
 * Created by ruiqianqi on 2017/3/14 0014.
 */

public class LocalProtocol {

    // 视频会议登录【来】
    public static final String LOGIN_GET = "/localserver/login";
    // 视频会议登录【去】
    public static final String LOGIN_PUSH = "/localserver/login/callback";

    // 视频会议添加朋友【来】
    public static final String ADD_FRIEND_GET = "/media/friend/add";
    // 视频会议添加朋友【去】
    public static final String ADD_FRIEND_PUSH = "/media/friend/add/response";

    // 视频会议移除朋友【来】
    public static final String REMOVE_FRIEND_GET = "/media/friend/remove";
    // 视频会议移除朋友【去】
    public static final String REMOVE_FRIEND_PUSH = "/media/friend/remove/response";


}
