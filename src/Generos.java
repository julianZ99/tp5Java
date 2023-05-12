public enum Generos {
    HC("Hardcore"), RK("Rock"), TP("Trap"), JZ("Jazz"), HP("Hip Hop"), POP("Pop"), MT("Metal"), CL("Clasico");

    private String name;

    private Generos(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

