package F_27_02_2013.combinable;

public class WritingMatrix extends MatrixDecorator {

    BasicMatrix writings;

    public WritingMatrix(Matrix matrix) {
        super(matrix);
        this.writings = new BasicMatrix();
    }

    @Override
    public void write(int x, int y, int z, Object data) {
        super.write(x, y, z, data);
        Integer write = (Integer) this.writings.read(x, y, z);
        this.writings.write(x, y, z, write+1);

    }

    @Override
    public Object read(int x, int y, int z){
        return super.read(x, y, z);
    }
}
