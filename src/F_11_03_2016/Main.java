package F_11_03_2016;

public class Main {

    public static void main(String[] args) throws Exception {
        SimpleMemory memory_simple = new SimpleMemory(20);

        byte data = 8;
        boolean ok = memory_simple.write(0, data);

        if (!ok)
            System.out.println("No se pudo escribir");
        else{
            MemorySet memory_set = new MemorySet();

            ErrorMemory memory_error = new ErrorMemory(memory_simple, 0.60f);
            VerificationMemory memory_ver = new VerificationMemory(memory_simple);

            memory_set.addMemory(memory_ver);
            memory_set.addMemory(memory_simple);
            memory_error.write(5, data);
            memory_set.addMemory(memory_error);

            memory_error.write(25, data);
            memory_ver.write(15, data);

//            memory_ver.read(25);

            for(int i = 0; i < memory_simple.size(); i++)
                System.out.println("["+ i + "] Data: " + memory_simple.read(i));

        }
    }

}
