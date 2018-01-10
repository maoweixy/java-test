package com.wei.mao.build;

/**
 * @Author 毛伟
 * @Date 10/17/17  16:07
 */
public class GenderTest {
    public static void main(String args[]) {
        Property property = Property.builder().gender(Gender.MALE).noise(Noise.QUIET).language(Language.ENGLISH).hasAccent(false).harsh(false).build();

        System.out.println(property);

    }
}
