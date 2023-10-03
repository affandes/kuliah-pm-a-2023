public class StackChar {

    char[] kumpulanData;
    int top;

    public StackChar(int n) {
        kumpulanData = new char[n];
        top = 0;
    }

    public void push(char data) {
        if (!isFull()) {
            kumpulanData[top] = data;
            top++;
        }
    }

    public char pop() {
        if (!isEmpty()) {
            top--;
            return kumpulanData[top];
        }
        return ' ';
    }

    public char peek() {
        return kumpulanData[top-1];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public boolean isFull() {
        return top == kumpulanData.length;
    }

}
