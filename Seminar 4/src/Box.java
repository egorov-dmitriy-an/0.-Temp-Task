public class Box <T> {
    private T object;

    public Box(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void showType(){
        System.out.println("Тип Т: " + object.getClass().getName());
    }
}

