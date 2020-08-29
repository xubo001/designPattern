package org.firewater.proxy.staticproxy;

public class StaticProxyTest {
    public static void main(String[] args) {
        Teacher teacher =new Teacher(new Student());
        teacher.study();
    }
}
