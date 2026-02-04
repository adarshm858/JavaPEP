package Abstraction;

public interface InterfaceFirst {
    void call();
        interface  InterfaceSecond{
            void hang();

        }
        interface InterfaceFusion extends InterfaceFirst,InterfaceSecond{
            void ring();
        }

        class ClassA implements InterfaceFusion{

            @Override
            public void ring() {

            }

            @Override
            public void hang() {

            }

            @Override
            public void call() {

            }
        }

    }
