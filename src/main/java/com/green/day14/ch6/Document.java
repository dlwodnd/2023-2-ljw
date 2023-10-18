package com.green.day14.ch6;

public class Document {
    String me;
    static int num = 0;

    public Document() {
        this("제목없음" + ++num);

    }

    public Document(String strs) {
        me = strs;
        System.out.printf("문서 %s가 생성 되었습니다.\n", me);
    }
}

class DocumentTest {
    public static void main(String[] args) {
        Document d1 = new Document(); //문서 제목없음1가 생성되었습니다.
        Document d2 = new Document("자바.txt");//문서 자바.txt가 생성되었습니다.
        Document d3 = new Document();//문서 제목없음2가 생성되었습니다.
        Document d4 = new Document();//문서 제목없음3가 생성되었습니다.
        Document d5 = new Document();//문서 제목없음4가 생성되었습니다.
    }
}
