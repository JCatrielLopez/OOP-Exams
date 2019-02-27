package F_27_02_2013.combinable;

public class BasicMatrix implements Matrix {

    Object [][][] matrix;

    public BasicMatrix(){
        this.matrix = new Object[][][]{};
    }

    @Override
    public void write(int x, int y, int z, Object data) {
        this.matrix[x][y][z] = data;

    }

    @Override
    public Object read(int x, int y, int z) {
        return this.matrix[x][y][z];
    }
}
