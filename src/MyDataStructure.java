public class MyDataStructure implements DataStructure{
    Object[] objects = new Object[100];
    int nextPut = 0;
    int nextGet = 0;

    public boolean put(Object obj) {

        objects[nextPut] = obj;
        nextPut = nextPut + 1;

        return false;
    }

    public Object get(){
if (nextGet > -1) {
    Object jawny = objects[nextGet];
    nextGet = nextGet + 1;

    return jawny;
}
return false;
    }
}


