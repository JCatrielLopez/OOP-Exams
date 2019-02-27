package F_27_02_2013;

public class WritingMatrix implements Matrix {

    BasicMatrix matrix;
    BasicMatrix writings;

    public WritingMatrix(){
        this.matrix = new BasicMatrix();
        this.writings = new BasicMatrix();
    }

    @Override
    public void write(int x, int y, int z, Object data) {
        this.matrix.write(x, y, z, data);
        Integer write = (Integer) this.writings.read(x, y, z);
        this.writings.write(x, y, z, write+1);
    }

    @Override
    public Object read(int x, int y, int z) {
        return this.matrix.read(x, y, z);
    }
}
