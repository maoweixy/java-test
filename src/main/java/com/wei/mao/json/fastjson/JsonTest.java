package com.wei.mao.json.fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.wei.mao.Utils.Utils;
import com.wei.mao.pojo.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.wei.mao.json.JSONResult.getSuccessWithSuccessStatus;

/**
 * @Author 毛伟
 * @Date 11/22/17  14:25
 */
public class JsonTest {
    @Data
    @AllArgsConstructor
    static class Body implements Cloneable{
        public Head head;

        @Override
        protected Object clone() throws CloneNotSupportedException {
            Body newBody =  (Body) super.clone();
            newBody.head = (Head) head.clone();
            return newBody;
        }
    }
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    static class Head implements Cloneable{
        public String face;

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        Body body = new Body(new Head("mao"));
        Body body1 = (Body) body.clone();
        System.out.println("body == body1 : " + (body == body1) );
        System.out.println("body.head == body1.head : " +  (body.head == body1.head));
        System.out.println("body.head.face == body1.head.face : " +  (body.head.getFace().hashCode() == body1.head.getFace().hashCode()));
        System.out.println(body.head.getFace());

        String s = "1";
        String s1 = "1";


    }
}
