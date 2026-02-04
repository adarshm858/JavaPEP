package Abstraction;

public class Main2 {
    public static void main() {
       LokSabhaImpl l1 =new LokSabhaImpl();
       l1.elect(8);
       l1.locationOfLokSabha();

        LokSabha l2 = new LokSabha() {
            @Override
            public void elect(int condidates) {
                System.out.println("Election is near :"+ condidates);
            }
        };

//LokSabhaImpl l2=new LokSabhaImpl();
    l2.elect(7);
    l2.locationOfLokSabha();
    LokSabha l3 = new LokSabha(){
        @Override
        public void elect(int condidates) {
            System.out.println("Election is Live :"+ condidates);
        }
        };
    l3.elect(9);
    l3.locationOfLokSabha();

    }
    }
