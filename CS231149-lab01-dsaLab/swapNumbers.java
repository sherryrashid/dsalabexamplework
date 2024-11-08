class SwapExample {
    int a;
    int b;

    public SwapExample(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void swap() {
        a = a + b; 
        b = a - b; 
        a = a - b; 
    }

    public void display() {
        System.out.println("a: " + a + ", b: " + b);
    }

    public static void main(String[] args) {
        SwapExample example = new SwapExample(5, 10);

        System.out.println("Before swapping:");
        example.display();  

        example.swap();     

        System.out.println("After swapping:");
        example.display();  
    }
}
