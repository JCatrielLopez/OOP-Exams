package F_27_02_2013.combinable;

public class MatrixDecorator implements Matrix {

    Matrix matrix;

    public MatrixDecorator(Matrix matrix){
        this.matrix = matrix;
    }

    @Override
    public void write(int x, int y, int z, Object data) {
        this.matrix.write(x, y, z, data);
    }

    @Override
    public Object read(int x, int y, int z) {
        return this.matrix.read(x, y, z);
    }
}
