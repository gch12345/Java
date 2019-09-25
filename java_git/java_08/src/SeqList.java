public class SeqList {
    private int[] Data;
    private int size;

    public SeqList(int len) {
        Data = new int [len];
        this.size = 0;
    }

    // 打印顺序表    
    public void display() {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(Data[i]);
            if(i != size - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        if (pos < 0 || pos > size) {
            return;
        }
        if(size == Data.length) {
            relloc();
        }
        if(pos == size) {
            Data[size] = data;
        } else {
            for (int i = size - 1; i >= pos; i--) {
                Data[i + 1] = Data[i];
            }
            Data[pos] = data;
        }
        size++;
        return;
    }

    //扩容
    private void relloc() {
        int[] arr = new int[Data.length * 2];
        for(int i = 0; i < size; i++) {
            arr[i] = Data[i];
        }
        Data = arr;
    }

    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for(int i = 0; i < size; i++) {
            if(Data[i] == toFind) {
                return true;
            }
        }
        return false;
    }

    // 查找某个元素对应的位置    
    public int search(int toFind) {
        for (int i = 0; i < size; i++) {
            if(Data[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    // 获取 pos 位置的元素    
    public int getPos(int pos) {
        if(pos < 0 || pos > size - 1) {
            return -1;
        }
        return Data[pos];
    }

    // 给 pos 位置的元素设为 value    
    public void setPos(int pos, int value) {
        if(pos < 0 || pos > size - 1) {
            return;
        }
        Data[pos] = value;
    }

    //删除第一次出现的关键字key    
    public void remove(int toRemove) {
        int re = search(toRemove);
        if(re != -1) {
            for(int i = re; i < size - 1; i++) {
                Data[i] = Data[i + 1];
            }
            size--;
        }
    }

    //清空顺序表    
    public void clear() {
        if (size == 0) {
            return;
        }
        for(int i = 0; i < size; i++) {
            Data[i] = 0;
        }
        size = 0;;
    }
}
