class Nested {
    public static void main(String[] args) {
        Orange orange = new Orange();
        Orange.Juice juice = orange.new Juice();
        orange.squeezeJuice();
        juice.flow();
    }

    public static class Orange {
        public void squeezeJuice() {
            System.out.println("Squeeze juice...");
        }

       class Juice {
            public void flow() {
                System.out.println("Juice dripped...");
            }
        }
    }
}