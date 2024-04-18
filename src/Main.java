public class Main {
    public static void main(String[] args) {

MyDataStructure myData = new MyDataStructure();


for(int i = 0; i < 101; i++) {
    myData.put(i);
        }

for(int i = 0; i < 101; i++) {
    Object data = myData.get();
    System.out.println(data);
}



    }
}