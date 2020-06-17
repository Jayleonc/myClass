package demo12;

public class a {
    public static void main(String[] args) {
        Person2.Chinese.sayHello();
        Person p = new Person() {
            @Override
            public void sayHello() {
                System.out.println("你好我是周杰伦！");
            }
        };
        p.sayHello();
    }


    interface Person {
        public abstract void sayHello();
    }

    enum Person2 {
        Chinese {
            public void sayHello() {
                System.out.println("你好");
            }
        },
        English {
            public void sayHello() {
                System.out.println("Hello");
            }
        };

        public abstract void sayHello();
    }
}
