package com.zccl.ruiqianqi.brain.eventbus;

/**
 * Created by ruiqianqi on 2017/3/23 0023.
 */

public class MindBusEvent {

    /**
     * 机器人名字改变事件
     */
    public static class NameEvent{
        private String text;

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }

    /**
     * 登录响应事件
     */
    public static class LoginEvent{
        private String text;
        private String rid;
        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getRid() {
            return rid;
        }

        public void setRid(String rid) {
            this.rid = rid;
        }
    }

    /**
     * 转发给视频APP事件
     */
    public static class ForwardLocalEvent{
        private String text;

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }

    /**
     * 转发给服务器事件
     */
    public static class ForwardSocketEvent{
        // 要发给服务器的协议CMD
        private String cmd;
        // 传送的字符串
        private String text;
        // 传送的byte[]
        private byte[] data;

        public String getCmd() {
            return cmd;
        }

        public void setCmd(String cmd) {
            this.cmd = cmd;
        }

        public byte[] getData() {
            return data;
        }

        public void setData(byte[] data) {
            this.data = data;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

    }

    /**
     * 翻译携带的文本
     */
    public static class TransEvent{

        // 退出翻译
        public static int TRANS_EXIT = -1;
        // 获取数据源失败
        public static int TRANS_FAILURE = 0;
        // 获取数据源成功
        public static int TRANS_SUCCESS = 1;

        private int type;
        private String text;

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }

    /**
     * 本地解析服务器响应的消息体
     */
    /*
    public static class ServerResponse{
        private int type;
        private byte[] header;
        private byte[] body;

        public void setType(int type) {
            this.type = type;
        }

        public int getType() {
            return type;
        }

        public byte[] getHeader() {
            return header;
        }

        public void setHeader(byte[] header) {
            this.header = header;
        }

        public byte[] getBody() {
            return body;
        }

        public void setBody(byte[] body) {
            this.body = body;
        }
    }
    */
}
