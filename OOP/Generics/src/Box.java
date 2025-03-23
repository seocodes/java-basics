public class Box<T> {
    T item;  //T could be any type, any<T>hing (lol hahahaha)

    public void setItem(T item){
        this.item = item;
    }

    public T getItem(){
        return this.item;
    }
}
