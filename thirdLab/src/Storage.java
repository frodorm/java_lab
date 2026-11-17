public class Storage<T> {
    private T[] storage;
    private int size;

    public Storage(T[] storage) {
        if (storage == null || storage.length < 1) {
            throw new IllegalArgumentException();
        }
        this.storage = storage;
        this.size = 0;
    }

    public void add(T value) {
        checkValue(value);
        if (storage.length == size) {
            throw new IllegalStateException("Переполнились");
        }
        storage[size] = value;
        size++;
    }

    public T get(int index) {
        checkIndex(index);
        return storage[index];
    }

    public void set(int index, T value) {
        checkValue(value);
        checkIndex(index);
        storage[index] = value;
    }

    public T remove(int index) {
        checkIndex(index);
        T removed = storage[index];
        size--;
        for (int i = index; i < size; i++) {
            storage[i] = storage[i + 1];
        }
        storage[size] = null;
        return removed;
    }

    private void checkValue(T value) {
        if (value == null) {
            throw new IllegalArgumentException("нелегальный аргумент");
        }
    }

    private void checkIndex(int index) {
        if (index > size - 1 || index < 0) {
            throw new IndexOutOfBoundsException("индекс аут оф баунд");
        }
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return storage.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
