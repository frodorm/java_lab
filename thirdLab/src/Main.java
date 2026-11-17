public class Main {
    public static void main(String[] args) {
        System.out.println("Создание и заполнение A, B, C и 1, 2");
        Storage<String> strs = new Storage<>(new String[3]);
        Storage<Integer> nums = new Storage<>(new Integer[2]);
        System.out.println("Вместимость, длинна и пустота до заполнения strs: " + strs.getCapacity() + " " + strs.getSize() + " " + strs.isEmpty());
        System.out.println("Вместимость, длинна и пустота до заполнения nums: " + nums.getCapacity() + " " + nums.getSize() + " " + nums.isEmpty());
        strs.add("A");
        strs.add("B");
        strs.add("C");
        nums.add(1);
        nums.add(2);
        System.out.println("длинна и пустота после заполнения strs: " + strs.getCapacity() + " " + strs.getSize() + " " + strs.isEmpty());
        System.out.println("длинна и пустота после заполнения nums: " + nums.getCapacity() + " " + nums.getSize() + " " + nums.isEmpty());
        System.out.println("получение по индексу 2 и 1: " + strs.get(2) + " " + nums.get(1));
        strs.set(2, "D");
        nums.set(1, 3);
        System.out.println("Замена по индексу 2 и 1 на D и 3: " + strs.get(2) + " " + nums.get(1));
        System.out.println("Длина до удаления: " + strs.getSize() + " " + nums.getSize());
        System.out.println("Удаление по индексу 1 и 0: " + strs.remove(1) + " " + nums.remove(0));
        System.out.println("Длина после удаления: " + strs.getSize() + " " + nums.getSize());
        try {
            strs.add("A");
            strs.add("A");
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
        try {
            nums.remove(-1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }
}
