package org.example;

public class OuterClass {
    private String name;

    public class InnerClass {
        private String name;

        private InnerClass(String name) {
            this.name = name;
        }

        private String getNameI() {
            return this.name;
        }
    }

    public OuterClass(String name) {
        this.name = name;
    }

    public String getNameO() {
        OuterClass o = new OuterClass("a");
        InnerClass i = o.new InnerClass("b");
        String name = OuterClass.this.name;
        return this.name;
    }

}


