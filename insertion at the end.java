class Main {

    static int addToEnd(int[] array, int size, int valueToAdd, int maxSize) {
        if (size >= maxSize) {
            System.out.println("The array is full. Cannot add " + valueToAdd);
            return size;
        }

        array[size] = valueToAdd;
        return size + 1;
    }

    public static void main(String[] args) {
        int[] numbers = new int[20];
        numbers[0] = 12;
        numbers[1] = 16;
        numbers[2] = 20;
        numbers[3] = 40;
        numbers[4] = 50;
        numbers[5] = 70;

        int maxSize = 20;  
        int currentSize = 6; 
        int newValue = 26; 

        System.out.print("Before adding: ");
        for (int i = 0; i < currentSize; i++) {
            System.out.print(numbers[i] + " ");
        }

        currentSize = addToEnd(numbers, currentSize, newValue, maxSize);

        System.out.print("\nAfter adding: ");
        for (int i = 0; i < currentSize; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}