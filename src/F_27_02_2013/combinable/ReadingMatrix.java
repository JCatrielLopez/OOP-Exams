package F_27_02_2013.combinable;

public class ReadingMatrix extends  MatrixDecorator {

    BasicMatrix readings;

    public ReadingMatrix(Matrix matrix) {
        super(matrix);
        this.readings = new BasicMatrix();
    }

    @Override
    public void write(int x, int y, int z, Object data) {
        super.write(x, y, z, data);
    }

    @Override
    public Object read(int x, int y, int z){
        Integer read = (Integer) this.readings.read(x, y, z);
        this.readings.write(x, y, z, read+1);

        return super.read(x, y, z);
    }
}
